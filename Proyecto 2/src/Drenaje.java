import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

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
 * La capacidad es la máxima por un drenaje y el mantenimeinto es la cantidad que se han realizado en su vida útil
 * Y la vida útil de un drenaje es de 10 años
 */

public class Drenaje  { 
	private int capacidad;
	private int mantenimientosHechos;
	private String fechaInstalacion;
	private String ubicacion;  

	public Drenaje() {
		this.capacidad = 0;
		this.mantenimientosHechos = 0;
		this.fechaInstalacion = "";
		this.ubicacion = "";
	}


	public Drenaje(int capacidad, int mantenimientosHechos, String fechaInstalacion, String ubicacion) {
		this.capacidad = capacidad;
		this.mantenimientosHechos = mantenimientosHechos;
		this.fechaInstalacion = fechaInstalacion;
		this.ubicacion = ubicacion;
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

	/*
	 * FUNCIONES CLAVE DE UN DREANJE
	 */

	public void vaciarDrenaje(){
		if(capacidad > 0){
			capacidad = capacidad -1;
		}
	}

	public void darMantenimiento(){
		mantenimientosHechos = mantenimientosHechos + 1;
	}


	/**
	 * Devuelve los días entre 2 fechas
	 * @param fechaDesde
	 * @param fechaHasta
	 * @return
	 */
	public static long diasEntreDosFechas(Date fechaDesde, Date fechaHasta){
		long startTime = fechaDesde.getTime() ;
		long endTime = fechaHasta.getTime();
		long diasDesde = (long) Math.floor(startTime / (1000*60*60*24)); // convertimos a dias, para que no afecten cambios de hora 
		long diasHasta = (long) Math.floor(endTime / (1000*60*60*24)); // convertimos a dias, para que no afecten cambios de hora
		long dias = diasHasta - diasDesde;

		return dias;
	}

	public String alertaMantenimiento() throws ParseException{
		float tiempo = 0; //cada cuanto, en días, se debe realizar un mantenimiento;
		tiempo = (10*365)/capacidad;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
		formatter.parse(fechaInstalacion);
	
		return "";
	}



	/** 
	 * @return String
	 */
	@Override
	public String toString() {
		return "El drenaje tiene una capacidad de " + getCapacidad() + " mantenimientos en su vida útil (10 años) \n"+
			"Así también, el drenaje está ubicado en la dirección " + getUbicacion();
	}


}