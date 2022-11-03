/*
 * @author Sharis Barrios
 * @author Gabriel Paz
 * @author Oscar Fuentes
 * @author David Trujillo
 * @date 06- 10 - 2022
 * Clase Main para crear todo el sistema de drenajes con la comunidad
 */


import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Comunidad comunity[] = new Comunidad[3];
        
        //REGISTRAR LAS COMUNIDADES
        for (int i = 0; i<comunity.length; i++){
            System.out.println("Escriba el nombre de la Comunidad");
            String nombre = scan.nextLine();
            System.out.println("Escriba el nombre del Municipio donde se encuentra la comunidad");
            String municipio = scan.nextLine();
            ArrayList<Familia> familias = new ArrayList<Familia>();
            ArrayList<Drenaje> drenajes = new ArrayList<Drenaje>(); 

            comunity[i] = new Comunidad(nombre,municipio, familias, drenajes);
        }
        

        System.out.println("-------MENU DE ADMINISTRACION DE DRENAJES------");
        System.out.println("1.USAR DRENAJE");
        System.out.println("2.VACIAR DRENAJE");
        System.out.println("3.SALIR");
        System.out.println("Ingrese el numero de la opcion");
        System.out.println("escriba abajo");
        
        int opc = scan.nextInt();
        

        while (opc != 3) {
            switch (opc) {
                case 1:
                    //USAR DRENAJES
                    int a = 0;
                    System.out.println("Seleccione la comunidad que utilizara le drenaje");
                    for (int i = 0; i<comunity.length; i++){
                        System.out.println(i +" Nombre: "+ comunity[i].getNombre() + "| Cantidad de personas: "+ comunity[i].calcularPersonas());
                        a++;
                    }
                    a = 0;
                    int comu = scan.nextInt();
                    System.out.println("Seleccione el drenaje que usara");
                    for (int i = 0; i<3; i++){
                        System.out.println("Drenaje "+a+" : " + comunity[comu].getDrenajes().get(i)+"%");
                        a++;
                    }
                    int dre = scan.nextInt();
                    System.out.println("¿Cuánta capacidad se usó del drenaje? 0-100");
                    int cap = scan.nextInt();
                    if (cap >= 0 && cap <= 100){
                        int total = comunity[comu].getDrenajes().get(dre).getCapacidad()+ cap;
                        if (total>= 0 && total<= 100){
                            comunity[comu].getDrenajes().get(dre).setCapacidad(total);
                        }
                        else{
                            System.out.println("Esa opción de capacidad no es valida");
                        }
                        
                    }
                    else{
                        System.out.println("Esa opción de capacidad no es valida");
                    }
                    break;


                case 2:
                    //VACIAR DRENAJES
                    a = 0;
                    System.out.println("Seleccione la comunidad de la cual vaciará el drenaje");
                    for (int i = 0; i<comunity.length; i++){
                        System.out.println(i +" Nombre: "+ comunity[i].getNombre() + "| Cantidad de personas: "+ comunity[i].calcularPersonas());
                        a++;
                    }
                    a = 0;
                    comu = scan.nextInt();
                    System.out.println("Seleccione el drenaje que vaciará");
                    for (int i = 0; i<3; i++){
                        System.out.println("Drenaje "+a+" : " + comunity[comu].getDrenajes().get(i)+"%");
                        a++;
                    }
                    dre = scan.nextInt();
                    System.out.println("¿Cuánto vaciara del drenaje? 0-100");
                    cap = scan.nextInt();
                    if (cap >= 0 && cap <= 100){
                        int total = comunity[comu].getDrenajes().get(dre).getCapacidad()- cap;
                        if (total>= 0 && total<= 100){
                            comunity[comu].getDrenajes().get(dre).vaciarDrenaje(cap);
                        }
                        else{
                            System.out.println("Esa opcion de capacidad no es valida");
                        }
                        
                    }
                    else{
                        System.out.println("Esa opcion de capacidad no es valida");
                    }
                    break;
                case 3:
                    //SALIR
                    System.out.println("ADIOS VUELVE PRONTO");
                    break;
                default:
                    System.out.println("OPCION INCORRECTA PORFAVOR SELECCIONE UNA OPCION DISPONIBLE");
                    break;
                
            }
            System.out.println("-------MENU DE ADMINISTRACION DE DRENAJES------");
            System.out.println("1.USAR DRENAJE");
            System.out.println("2.VACIAR DRENAJE");
            System.out.println("3. SALIR");
            System.out.println("Ingrese el numero de la opcion");
            System.out.println("escriba abajo");
            opc = scan.nextInt();
        }
    }
}