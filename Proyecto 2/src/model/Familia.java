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
    private int contador; 
    private int integrantes;
    private String direccion; 
    private int telefono;
    private int agua; 


    public Familia() {
        this.contador = 0;
        this.integrantes = 0;
        this.direccion = "";
        this.telefono = 0;
        this.agua = 0;
    }

    public Familia(int contador, int integrantes, String direccion, int telefono, int agua) {
        this.contador = contador;
        this.integrantes = integrantes;
        this.direccion = direccion;
        this.telefono = telefono;
        this.agua = agua;
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
     * @return int
     */
    public int getAgua() {
        return this.agua;
    }

    
    /** 
     * @param agua
     */
    public void setAgua(int agua) {
        this.agua = agua;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " El contador de agua de la vivienda en la dirección" + getDireccion()
            + " es \n" + getContador() +
            " La cantidad de integrantes de esta familia es " + getIntegrantes() + "\n" +
            " Su télefono es " + getTelefono() + ", y la cantidad de agua asignada es " + getAgua() + "mL";
    }

}
