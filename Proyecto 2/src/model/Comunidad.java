/*
 * @author Sharis Barrios
 * @author Gabriel Paz
 * @author Oscar Fuentes
 * @author David Trujillo
 * @date 06- 10 - 2022
 * Clase para crear una comunidad con su sistema de dreanjes especificados
 */

package model;
import java.util.ArrayList;
import java.lang.Math;

public class Comunidad { //creamos la clase Comunidad
    private String nombre;
	private String municipio;
    private ArrayList<Familia> familias;
    private ArrayList<Drenaje> drenajes; 

	public Comunidad() {
        nombre = "";
    	municipio = "";
        familias = new ArrayList<Familia>();
		drenajes = new ArrayList<Drenaje>();
        }
        

	public Comunidad(String nombre, String municipio, ArrayList<Familia> familias, ArrayList<Drenaje> drenajes) {
		this.nombre = nombre;
		this.municipio = municipio;
		this.familias = familias;
		this.drenajes = drenajes;
	}
	

	
	/** 
	 * @return String
	 */
	public String getNombre() {
		return this.nombre;
	}

	
	/** 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	/** 
	 * @return String
	 */
	public String getMunicipio() {
		return this.municipio;
	}

	
	/** 
	 * @param municipio
	 */
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	
	/** 
	 * @return ArrayList<Familia>
	 */
	public ArrayList<Familia> getFamilias() {
		return this.familias;
	}

	
	/** 
	 * @param familias
	 */
	public void setFamilias(ArrayList<Familia> familias) {
		this.familias = familias;
	}

	
	/** 
	 * @return ArrayList<Drenaje>
	 */
	public ArrayList<Drenaje> getDrenajes() {
		return this.drenajes;
	}

	
	/** 
	 * @param drenajes
	 */
	public void setDrenajes(ArrayList<Drenaje> drenajes) {
		this.drenajes = drenajes;
	}
       
	
	
	/** 
	 * @return int
	 */
	/*
	 * FUNCIONES CLAVE DE UNA COMUNIDAD
	 */


	public int calcularFamilias(){
		int cantFam = 0; 
		cantFam = familias.size();
		return cantFam;
	}
	
	
	/** 
	 * @return int
	 */
	public int calcularPersonas(){
		int cantPersonas = 0; 
		for(Familia fam: familias){
			cantPersonas = cantPersonas + fam.getIntegrantes();
		}
		return cantPersonas;
	} 



	
	/** 
	 * @return int
	 */
	public int calcularDrenajes(){
		// Por cada 100 personas debe haber un drenaje
		int cantPersonas = 0; 
		for(Familia fam: familias){
			cantPersonas = cantPersonas + fam.getIntegrantes();
		}
		float drenaje = cantPersonas/100;
		return Math.round(drenaje);
	}

	 
	 /** 
	  * @param mantTotales
	  * @param mantHechos
	  * @return float
	  */
	 /*
	 * Calcular la vida útil de drenaje con base a los mantenimientos
	 */

	public float porcentajeDeVida(int mantTotales, int mantHechos){
		float cambios = mantHechos*100/mantTotales;
		return cambios;
	}	
	
	
	
	/** 
	 * @return String
	 */
	public String vidaUtilDrenajes(){ 
		String mensaje = "";
		float cambios = 0;
		for(Drenaje dren: drenajes){
			cambios = porcentajeDeVida(dren.getMantTotales(), dren.getMantenimientosHechos());
			if(cambios >= 75 ){
				mensaje = mensaje + dren.toString() + "La vida útil del drenaje ubicado en " +dren.getUbicacion() +  "está en un 75% \n";
				return mensaje;}
			if(cambios < 75 && cambios >= 50 ){
				mensaje = mensaje + dren.toString() + "La vida útil del drenaje ubicado en " +dren.getUbicacion() +  "está en un 50% \n";
				return mensaje;}
			if(cambios < 50 && cambios >= 25 ){
				mensaje = mensaje + dren.toString() + "La vida útil del drenaje ubicado en " +dren.getUbicacion() +  "está en un 25%\nEste es un estado de Alerta. \n";
				return mensaje;}
			if(cambios < 25){
				mensaje = mensaje + dren.toString() + "La vida útil está llegando a su fin.\nEn los siguientes meses debe considerar cambiar o dar un mantenimeinto fuerte al sistema \n";	
			}
		}
		return mensaje;
	}
	
	/** 
	 * @return String
	 */
	@Override
	public String toString() {
		return "La comunidad " + getNombre() + " está ubicada en el municipio de " + getMunicipio()+
			"La cantidad de familias que hay en la comunidad es de" + calcularFamilias() +  "\n" +
			"Y la cantidad de drenajes de la comunidad es de " + calcularDrenajes();
	}
}