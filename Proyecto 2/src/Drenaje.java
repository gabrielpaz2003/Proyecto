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
 * La capacidad inicia en cero y conforme se utiliza va aumentando hasta llegar a un 100%
 * El mantenimeinto es la cantidad que se han realizado en su vida útil
 * Y la vida útil de un drenaje es de 10 años
 */

public class Drenaje  { 
	private int capacidad;
	private int mantTotales;
	private int mantenimientosHechos;
	private String fechaInstalacion;
	private String ubicacion;  

	public Drenaje() {
		this.capacidad = 0;
		this.mantenimientosHechos = 0;
		this.fechaInstalacion = "";
		this.ubicacion = "";
		this.mantTotales = 0;
	}


	public Drenaje(int capacidad,int mantTotales, int mantenimientosHechos, String fechaInstalacion, String ubicacion) {
		this.capacidad = capacidad;
		this.mantenimientosHechos = mantenimientosHechos;
		this.fechaInstalacion = fechaInstalacion;
		this.ubicacion = ubicacion;
		this.mantTotales = mantTotales;
	}

	
	/** 
	 * @return int
	 */
	public int getMantTotales() {
		return this.mantTotales;
	}

	
	/** 
	 * @param mantTotales
	 */
	public void setMantTotales(int mantTotales) {
		this.mantTotales = mantTotales;
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
	public int getCapacidad() {
		return this.capacidad;
	}

	
	/** 
	 * @param capacidad
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}


	public void vaciarDrenaje(int cantidad){
		capacidad = capacidad - cantidad;
	}

	public void darMantenimiento(){
		mantenimientosHechos = mantenimientosHechos + 1;
	}


	/** 
	 * @return String
	 */
	@Override
	public String toString() {
		return "El drenaje tiene una capacidad de " + getCapacidad() + "\n Y tiene una cantidad de mantenimientos en su vida útil (10 años) de \n"+ getMantTotales()+
			"Así también, el drenaje está ubicado en la dirección " + getUbicacion();
	}

}