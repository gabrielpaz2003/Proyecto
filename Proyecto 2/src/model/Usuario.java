package model;
import java.io.*;

/*
 * @author Sharis Barrios
 * @author Gabriel Paz
 * @author Oscar Fuentes
 * @author David Trujillo
 * @date 06- 10 - 2022
 * Clase que almacenara la informacion sobre el usuario: nombre, contrasena y los permisos que tenga la cuenta
 */
 
public class Usuario implements Serializable{
    protected String NombreUsuario;
    protected String Contrasena;
    

    /**
     * Getter para Nombre del Usuario
     * @return String Nombre
     */

    public String getNombreUsuario() {
        return NombreUsuario;
    }


    /**
     * Getter para la contraseña
     * @return String contraseña
     */
    public String getContrasena() {
        return Contrasena;
    }


    public Usuario(String nombreUsuario, String contrasena) {
        NombreUsuario = nombreUsuario;
        Contrasena = contrasena;
        
    }

    

}
