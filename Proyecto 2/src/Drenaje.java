/*
 * @author Sharis Barrios
 * @author Gabriel Paz
 * @author Oscar Fuentes
 * @author David Trujillo
 * @date 06- 10 - 2022
 * Clase para crear un drenaje para comunidades
 */

/*
 * CONOCIMIENTO PREVIO
 * La capacidad es la máxima por un drenaje y el mantenimeinto es la cantidad que necesita en su vida útil
 * Los mantenimientos se fijaran segun las capacidades. 
 * Y la vida útil de un drenaje es de 10 años
 */

public class Drenaje  { 
	private float capacidad;
	private int mantenimientoTotal;
	private int mantenimientosHechos;
	private String fechaInstalacion;
	private String ubicacion;  

	public Drenaje() {
		this.capacidad = 0;
		this.mantenimientoTotal = 0;
		this.mantenimientosHechos = 0;
		this.fechaInstalacion = "";
		this.ubicacion = "";
	}


	public Drenaje(float capacidad, int mantenimientoTotal, int mantenimientosHechos, String fechaInstalacion, String ubicacion) {
		this.capacidad = capacidad;
		this.mantenimientoTotal = mantenimientoTotal;
		this.mantenimientosHechos = mantenimientosHechos;
		this.fechaInstalacion = fechaInstalacion;
		this.ubicacion = ubicacion;
	}



	
	/** 
	 * @return int
	 */
	public int getMantenimientoTotal() {
		return this.mantenimientoTotal;
	}

	
	/** 
	 * @param mantenimientoTotal
	 */
	public void setMantenimientoTotal(int mantenimientoTotal) {
		this.mantenimientoTotal = mantenimientoTotal;
	}

	
	/** 
	 * @return int
	 */
	public int getMantenimientosHechos() {
		return this.mantenimientosHechos;
	}

	
	/** 
	 * @param mantenimientosHechos
	 */
	public void setMantenimientosHechos(int mantenimientosHechos) {
		this.mantenimientosHechos = mantenimientosHechos;
	}
	
	/** 
	 * @return String
	 */
	public String getUbicacion() {
		return this.ubicacion;
	}

	
	/** 
	 * @param ubicacion
	 */
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	
	/** 
	 * @return String
	 */
	public String getFechaInstalacion() {
		return this.fechaInstalacion;
	}

	
	/** 
	 * @param fechaInstalacion
	 */
	public void setFechaInstalacion(String fechaInstalacion) {
		this.fechaInstalacion = fechaInstalacion;
	}

	
	/** 
	 * @return float
	 */
	public float getCapacidad() {
		return this.capacidad;
	}

	
	/** 
	 * @param capacidad
	 */
	public void setCapacidad(float capacidad) {
		this.capacidad = capacidad;
	}

	/*
	 * FUNCIONES CLAVE DE UN DREANJE
	 */

	public void vaciarDrenaje(){

	}


	public void darMantenimiento(){

	}

	public void alertaMantenimiento(){

	}



	/** 
	 * @return String
	 */
	@Override
	public String toString() {
		return "El drenaje tiene una capacidad de " + getCapacidad() + " mL \n" +
			"Se deben realizar "+ getMantenimientoTotal() + " mantenimientos en su vida útil \n"+
			"Así también, el drenaje está ubicado en la dirección " + getUbicacion();
	}


}