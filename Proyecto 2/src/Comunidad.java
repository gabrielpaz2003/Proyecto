import java.util.ArrayList;

public class Comunidad  { //creamos la clase Comunidad
    private int personas;
    private String nombre;
    private ArrayList<Familia> familias;
    private ArrayList<Drenaje> drenajes; 

	public Comunidad() {
        nombre = "";
    	personas = 0;
        familias = new ArrayList<Familia>();
		drenajes = new ArrayList<Drenaje>();
        }
        

	public Comunidad(String nom, int per){
		nombre = nom;
		personas = per;
	}


	
	/** 
	 * @return int
	 */
	public int getPersonas() {
		return this.personas;
	}

	
	/** 
	 * @param personas
	 */
	public void setPersonas(int personas) {
		this.personas = personas;
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

        
	

	 /*
	 * Calcular la vida útil de drenaje con base a los mantenimientos
	 */
	public String vidaUtilDrenajes(){
		// Con la cantidad de mantimientos
		int mantenimientos = 2;//cantMantenimientos(); 
		int vidaUtilPromedio = 10; 
		float cambios = mantenimientos*100/vidaUtilPromedio;
		if(cambios >= 75 ){
			String mensaje = "La vida útil está en un 75%";
			return mensaje;}
		if(cambios < 75 && cambios >= 50 ){
			String mensaje = "La vida útil está en un 50%";
			return mensaje;}
		if(cambios < 50 && cambios >= 25 ){
			String mensaje = "La vida útil está en un 25%\nEste es un estado de Alerta. ";
			return mensaje;}
		if(cambios < 25){
			String mensaje = "La vida útil está llegando a su fin.\nEn los siguientes meses debe considerar cambiar o dar un mantenimeinto fuerte al sistema";	
			return mensaje;}
	}
	
	/** 
	 * @return String
	 */
	@Override
	public String toString() {
		return "{" +
			" personas='" + getPersonas() + "'" +
			", nombre='" + getNombre() + "'" +
			", familias='" + getFamilias() + "'" +
			", drenajes='" + getDrenajes() + "'" +
			"}";
	}
}
