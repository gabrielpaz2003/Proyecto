package model;

/*
 * @author Sharis Barrios
 * @author Gabriel Paz
 * @author Oscar Fuentes
 * @author David Trujillo
 * @date 06- 10 - 2022
 * Clase para crear una familia que son relevantes en una comunidad
 */

public class Familia {
    private String apellido;
    private int contador; 
    private int integrantes;
    private String direccion; 
    private int telefono;


    public Familia() {
        this.apellido = "";
        this.contador = 0;
        this.integrantes = 0;
        this.direccion = "";
        this.telefono = 0;
    }

    public Familia(String apellido,int contador, int integrantes, String direccion, int telefono) {
        this.apellido = apellido;
        this.contador = contador;
        this.integrantes = integrantes;
        this.direccion = direccion;
        this.telefono = telefono;
    }


    
    /** 
     * @return int
     */
    public int getContador() {
        return this.contador;
    }

    
    /** 
     * @param contador
     */
    public void setContador(int contador) {
        this.contador = contador;
    }

    
    /** 
     * @return int
     */
    public int getIntegrantes() {
        return this.integrantes;
    }

    /** 
     * @return String
     */
    public String getApellido() {
        return this.apellido;
    }
    
    /** 
     * @param integrantes
     */
    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }

    
    /** 
     * @return String
     */
    public String getDireccion() {
        return this.direccion;
    }

    
    /** 
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    /** 
     * @return int
     */
    public int getTelefono() {
        return this.telefono;
    }

    
    /** 
     * @param telefono
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return
            "APELLIDO DE FAMILIA: "+getApellido()+
            "\nCONTADOR:"+ getContador()+ 
            "\nDIRECCION: " + getDireccion() +
            "\nINTEGRANTES: "+ getIntegrantes() +
            "\nTELEFONO: " + getTelefono();
    }

}
