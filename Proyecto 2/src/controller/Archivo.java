import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;

public class Archivo {
    private File archivo;

    public Archivo (String nombreArchivo){
        archivo = new File(nombreArchivo);
        try {
            archivo.createNewFile();
        } catch (IOException e) {
            // El archivo ya existe o está en uso
            e.printStackTrace();
        }
    }
    
    public void escribirArchivo(String linea){
        try {
            FileWriter miEscritor = new FileWriter(archivo);
            miEscritor.write(linea);
            miEscritor.close();
        } catch (IOException e) {
            // Ocurrió un error en la escritura
            e.printStackTrace();
        }
    }
    public ArrayList<String> leerArchivo(){
        Scanner miLector;
        ArrayList<String> lineas = new ArrayList<String>();
        try {
            miLector = new Scanner(archivo);        
            while (miLector.hasNextLine()){
                lineas.add(miLector.nextLine());
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return lineas;
    }
    public String leerArchivoString(){
        String texto = "";
        try {
            Scanner miLector = new Scanner(archivo);
            while (miLector.hasNextLine()){
                texto = texto + miLector.nextLine() + "\n";
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return texto;
    }

    public void eliminarArchivo(){
        archivo.delete();
    }
}
