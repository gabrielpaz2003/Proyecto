/*
 * @author Sharis Barrios
 * @author Gabriel Paz
 * @author Oscar Fuentes
 * @author David Trujillo
 * @date 06- 10 - 2022
 * Clase DriverProgram para crear todo el sistema de drenajes con la comunidad
 */


package view;
import java.util.ArrayList;
import java.util.Scanner;
import controller.*;
import model.*;

public class DriverProgram {


    

    /**
     * 
     * Método main, inicia la ejecución del programa.
     * @param args
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Login.setAdminUser();
        ArrayList<Comunidad> comunity = new ArrayList<>();


        

        
        System.out.println("-------------------------------------------------------");
        System.out.println("Bienvenido al sistema de control y manejo de drenajes");
        System.out.println("-------------------------------------------------------");

        System.out.println("1. Iniciar Sesion \n2. Crear Usuario \n3. Cerrar programa");
        System.out.println("---------------------------------");
        System.out.println("Porfavor seleccione una opcion (1-3)");
        Integer opcion = scan.nextInt();
        while (opcion != 3){
            switch (opcion){
                case 1:
                    
                    System.out.println("Logueando...");

                    int userIndex = Login.login();
                    //Control point
                    

                    if(userIndex == 0){
                        System.out.println("-------------------------------------------------------");
                        System.out.println("      ENTRANDO AL MODO ADMINISTRADOR DEL SISTEMA");
                        System.out.println("-------------------------------------------------------");

                        System.out.println("1.Registrar comunidad \n2.Mostrar comunidades \n3.Seleccionar una comunidad \n4.Salir");
                        System.out.println("---------------------------------");
                        System.out.println("Porfavor seleccione una opcion (1-4)");
                        int op= scan.nextInt();
                        while(op !=4){
                            switch (op){
                                case 1: ///Registrar comunidad
                                    scan.nextLine();
                                    System.out.println("Ingrese el nombre de la comunidad");
                                    String nombre = scan.nextLine();
                                    System.out.println("Ingrese el municipio de la comunidad");
                                    String muni = scan.nextLine();
                                    ArrayList<Familia> familias = new ArrayList<Familia>();
		                            ArrayList<Drenaje> drenajes = new ArrayList<Drenaje>();
                                    comunity.add(new Comunidad(nombre,muni,familias,drenajes));

                                break;
                                case 2://Mostrar comunidades
                                    System.out.println("--------------------COMUNIDADES-------------------------");
                                    for (Comunidad c: comunity){
                                        System.out.println("-----------------------------------------------------");
                                        System.out.println(c.toString());
                                    }
                                    System.out.println("-------------------------------------------------");
                                break;

                                case 3://Seleccionar una comunidad
                                    System.out.println("--------------------COMUNIDADES-------------------------");
                                    for (int i = 0; i < comunity.size();i++){
                                        System.out.println((i+1)+" "+comunity.get(i).getNombre());
                                    }
                                    System.out.println("Porfavor seleccione una comunidad");
                                    int com= scan.nextInt();
                                    System.out.println("1. Ver familias \n2. Drenajes \n3. Salir");
                                    System.out.println("---------------------------------");
                                    System.out.println("Porfavor seleccione una opcion (1-3)");
                                    int opc = scan.nextInt();
                                    while (opc != 3){
                                        switch (opc){
                                            case 1://Mostrar las familias 
                                                comunity.get(com-1).mostrarFamilias();
                                            break;
                                            case 2://Usar un drenaje
                                                comunity.get(com-1).getDrenajes();
                                                System.out.println("Porfavor seleccione un drenaje");
                                                int dre= scan.nextInt();
                                                System.out.println("1. Instalar \n2. Usar drenaje \n3. Dar mantenimiento \n4. Ver Drenaje \n5. Salir");
                                                System.out.println("---------------------------------");
                                                System.out.println("Porfavor seleccione una opcion (1-5)");
                                                int opci = scan.nextInt();
                                                while (opci != 5){
                                                    switch (opci){
                                                        case 1:
                                                            System.out.println("Porfavor ingrese la fecha de instalacion");
                                                            scan.nextLine();
                                                            String fecha = scan.nextLine();
                                                            comunity.get(com-1).instalarDrenaje(dre-1, fecha);
                                                        break;
                                                        case 2:
                                                            comunity.get(com-1).usarDrenaje(dre-1);
                                                        break;
                                                        case 3:
                                                            comunity.get(com-1).darMantenimiento(dre-1);
                                                        break;
                                                        case 4:
                                                            comunity.get(com-1).getDrenaje(dre-1);;
                                                        break;
                                                    }
                                                    System.out.println("1. Instalar \n2. Usar drenaje \n3. Dar mantenimiento \n4. Ver Drenaje \n5. Salir");
                                                    System.out.println("---------------------------------");
                                                    System.out.println("Porfavor seleccione una opcion (1-4)");
                                                    opci = scan.nextInt();
                                                }
                                            break;
                                        }
                                        System.out.println("1. Ver familias \n2. Instalar drenaje \n3. Salir");
                                        System.out.println("---------------------------------");
                                        System.out.println("Porfavor seleccione una opcion (1-3)");
                                        opc = scan.nextInt();
                                    }
                            }
                            System.out.println("1.Registrar comunidad \n2.Mostrar comunidades \n3.Seleccionar una comunidad \n4.Salir");
                            System.out.println("---------------------------------");
                            System.out.println("Porfavor seleccione una opcion (1-4)");
                            op= scan.nextInt(); 
                        }

                    }else{
                        System.out.println("-------------------------------------------------------");
                        System.out.println("    BIENVENIDO A NUESTRO CONTROL DE DRENAJES DE LA CIUDAD");
                        System.out.println("-------------------------------------------------------");

                        System.out.println("1.Registrar a su familia \n2.Mostrar comunidades \n3.Consejos para cuidar los drenajes \n4.Salir");
                        System.out.println("---------------------------------");
                        System.out.println("Porfavor seleccione una opcion (1-4)");
                        int op= scan.nextInt();
                        while(op !=4){
                            switch (op){
                                case 1: ///Registrar la familia
                                    System.out.println("--------------------COMUNIDADES-------------------------");
                                    for (int i = 0; i < comunity.size();i++){
                                        System.out.println((i+1)+" "+comunity.get(i).getNombre());
                                    }
                                    System.out.println("Porfavor seleccione una comunidad");
                                    int com= scan.nextInt();
                                    scan.nextLine();
                                    System.out.println("Ingrese el apellido de su familia");
                                    String apellido = scan.nextLine();
                                    System.out.println("Ingrese el numero de contador de su familia");
                                    int contador = scan.nextInt();
                                    System.out.println("Ingrese la cantidad de integrantes su familia");
                                    int integrantes = scan.nextInt();
                                    scan.nextLine();
                                    System.out.println("Ingrese la direccion donde recide su familia");
                                    String direccion = scan.nextLine();
                                    System.out.println("Ingrese el telefono de su familia");
                                    int telefono = scan.nextInt();
                                    Familia fam = new Familia(apellido,contador,integrantes,direccion,telefono);
                                    comunity.get(com-1).agregarFamilia(fam); 
                                    int cantidad = comunity.get(com-1).calcularDrenajes();
                                    Drenaje dre = new Drenaje(comunity.get(com-1).getNombre());
                                    comunity.get(com-1).agregarDrenajes(cantidad, dre);
                                break;

                                case 2: ///Mostrar las comunidades
                                System.out.println("--------------------COMUNIDADES-------------------------");
                                for (Comunidad c: comunity){
                                    System.out.println("-----------------------------------------------------");
                                    System.out.println(c.toString());
                                }
                                System.out.println("-------------------------------------------------");
                                break;
                            }
                            System.out.println("-------------------------------------------------------");
                            System.out.println("    BIENVENIDO A NUESTRO CONTROL DE DRENAJES DE LA CIUDAD");
                            System.out.println("-------------------------------------------------------");

                            System.out.println("1.Registrar a su familia \n2.Mostrar comunidades \n3.Consejos para cuidar los drenajes \n4.Salir");
                            System.out.println("---------------------------------");
                            System.out.println("Porfavor seleccione una opcion (1-4)");
                            op= scan.nextInt();
                        }
                    }
                    break;
                    
                    
                    
                    

                case 2:
                    System.out.println("Ventana de registro");
                    Login.Registrar();
                    break;

                case 3:
                    
                    System.out.println("Gracias esperemos que vuelva pronto.");
                default:
                    System.out.println("Debe ingresar una opción valida.");
                    break;

                
            }
        System.out.println("1. Iniciar Sesion \n2. Crear Usuario \n3. Cerrar programa");
        System.out.println("---------------------------------");
        System.out.println("Porfavor seleccione una opcion (1-3)");
        opcion = scan.nextInt();
        }
    }
}
