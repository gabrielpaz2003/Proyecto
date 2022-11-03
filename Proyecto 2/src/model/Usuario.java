package model;
import java.io.*;
import java.util.ArrayList;

/**
 * Clase que almacenara la informacion sobre el usuario: nombre, contrasena y los persmisos que tenga la cuenta
 * @autor Jose Gramajo
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
