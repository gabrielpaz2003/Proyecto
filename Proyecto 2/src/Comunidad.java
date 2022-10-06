public class Comunidad  { //creamos la clase Comunidad
    private int personas;
    private String nombre;
    private ArrayList<Familia> familias;
    private ArrayList<drenaje> drenajes; 

	public Comunidad() {
        nombre = "";
    	personas = 0;
        for(int i =0; i<4; i++) {
            drenajes[i]= 0;
        }
        
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
	 * @param capacidad
	 * @param posicion
	 */
	public void setDrenajes(int capacidad, int posicion){
        drenajes[posicion] = capacidad;
    }

	/** 
	* @param posicion
	* @return int
	*/
	public int getDrenajes(int posicion){
		return drenajes[posicion];
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
