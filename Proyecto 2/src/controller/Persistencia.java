package controller;

/******************************************************************
 * 
 * Author: Gabriel Paz. Carnet 221087 * Fecha de edicion 15-11-2022
 * 
 * Archivo para manejo de persistencia de datos
 * 
 ******************************************************************/

import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;


public class Persistencia {
    
    public static void crearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se creo el archivo");
        } catch (FileNotFoundException ex) {
            // TODO Auto-generated catch block
            ex.printStackTrace(System.out);
        }
    }

    public static void editarArchivo(String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Se escribio el archivo");
        } catch (FileNotFoundException ex) {
            // TODO Auto-generated catch block
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            // TODO Auto-generated catch block
            ex.printStackTrace(System.out);
        }
        
    }

    public static void leerArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while(lectura != null){
                System.out.println(lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            // TODO Auto-generated catch block
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            // TODO Auto-generated catch block
            ex.printStackTrace(System.out);
        }
        
    }


}
