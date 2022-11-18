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
	 * @param familia
	 */
	public void agregarFamilia(Familia familia){
		familias.add(familia);
	}

	
	/** 
	 * @param cantidad
	 * @param drenaje
	 */
	public void agregarDrenajes(int cantidad, Drenaje drenaje){
		for (int i = 0; i < cantidad;i++){
			drenajes.add(drenaje);
		}
	}

	public void mostrarFamilias(){
		for (int i = 0; i < familias.size();i++){
			System.out.println((i+1)+" "+familias.get(i).toString());
		}
	}
	public void mostrarDrenajes(){
		for (int i = 0; i < drenajes.size();i++){
			System.out.println((i+1)+" "+drenajes.get(i).toString());
		}
	}
	
	
	/** 
	 * @return String
	 */
	public void getDrenajes(){
		for (int i = 0; i < drenajes.size();i++){
			System.out.println((i+1)+" "+drenajes.get(i).getDrenaje());
		}
	}

	
	/** 
	 * @param posicion
	 */
	public void getDrenaje(int posicion){
		System.out.println(drenajes.get(posicion).toString());
	}

	
	/** 
	 * @param posicion
	 * @param fecha
	 */
	public void instalarDrenaje(int posicion, String fecha){
		drenajes.get(posicion).setFechaInstalacion(fecha);
	}

	
	/** 
	 * @param posicion
	 */
	public void usarDrenaje(int posicion){
		int cap = drenajes.get(posicion).getCapacidad();
		int total = cap - 20;
		if(cap<=20){
			System.out.println("No se puede usar el drenaje porfavor dar mantenimiento");
		}else{
			drenajes.get(posicion).setCapacidad(total);
		}
		System.out.println("CAPACIDAD DE DRENAJE: "+total+"%");

	}

	
	/** 
	 * @param posicion
	 */
	public void darMantenimiento(int posicion){
		int cap = drenajes.get(posicion).getCapacidad();
		int mantenimientos = drenajes.get(posicion).getMantTotales();
		int total = cap + 20;
		int mantenimientosTotal = mantenimientos + 1;
		if(cap>=100){
			System.out.println("El drenaje se encuentra en buen estado no es necesario el mantenimiento");
		}else{
			drenajes.get(posicion).setCapacidad(total);
			drenajes.get(posicion).setMantTotales(mantenimientosTotal);
		}
		System.out.println("CAPACIDAD DE DRENAJE: "+total+"%");
	}

	/** 
	 * @return ArrayList<Drenaje>
	 */
	public ArrayList<Drenaje> getDrenajeArray() {
		return this.drenajes;
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
		return "La comunidad " + getNombre() + " está ubicada en el municipio de " + getMunicipio();
	}
}