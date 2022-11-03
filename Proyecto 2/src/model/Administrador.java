package model;
/**
 * @author Sharis Barrios
 * @author Gabriel Paz
 * @author Oscar Fuentes
 * @author David Trujillo
 * @date 06- 10 - 2022
 * Clase Administrador para guardar la información de los usuarios
 */

public class Administrador extends Usuario{

    /**
     * Constructor de un usuario administrador
     * @param nombreUsuario
     * @param contrasena
     */
    public Administrador(String nombreUsuario, String contrasena) {
        super(nombreUsuario, contrasena);
        
    }
}
