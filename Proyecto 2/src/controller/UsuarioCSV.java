package controller;
import model.Usuario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class UsuarioCSV {
    
    protected String archivoLeer;
    protected String archivoEscribir;
    private ArrayList<Usuario> usuarios;
    
    /**
     * @param archivoLeer
     * @param archivoEscribir
     */

    public UsuarioCSV(String archivoLeer, String archivoEscribir, ArrayList<Usuario> usuarios){
        this.archivoLeer = archivoLeer;
        this.archivoEscribir = archivoEscribir;
        if(usuarios == null){
            this.usuarios = new ArrayList<Usuario>();
        }
        else{
            this.usuarios = usuarios;
        }
    }

    public void leerArchivo(){
        FileReader fr;
        try {
            fr = new FileReader(this.archivoLeer);
            String linea = "";
            BufferedReader br = new BufferedReader(fr);
            while((linea = br.readLine()) != null){
                String[] datoslinea = linea.split(";");
                String NombreUsuario = datoslinea[0].trim();
                String Contrasena = datoslinea[1].trim();
                Usuario u = new Usuario(NombreUsuario, Contrasena);
                this.usuarios.add(u);
            }
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        } 
    }

}
