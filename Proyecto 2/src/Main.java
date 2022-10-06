import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);


        Comunidad comunity[] = new Comunidad[3];
        
        //REGISTRAR LAS COMUNIDADES
        for (int i = 0; i<comunity.length; i++){
            System.out.println("Escriba el nombre de la comunidad");
            String nombre = scan.nextLine();
            System.out.println("Escriba la cantidad de personas que hay dentro de la comunidad");
            int personas = scan.nextInt();
            scan.nextLine();

            comunity[i] = new Comunidad(nombre,personas);
        }
        

        System.out.println("-------MENU DE ADMINISTRACION DE DRENAJES------");
        System.out.println("1.USAR DRENAJE");
        System.out.println("2.VACIAR DRENAJE");
        System.out.println("3. SALIR");
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
                        System.out.println(i +" Nombre: "+ comunity[i].getNombre() + "| Cantidad de personas: "+ comunity[i].getPersonas());
                        a++;
                    }
                    a = 0;
                    int comu = scan.nextInt();
                    System.out.println("Seleccione el drenaje que usara");
                    for (int i = 0; i<3; i++){
                        System.out.println("Drenaje "+a+" : " + comunity[comu].getDrenajes(i)+"%");
                        a++;
                    }
                    int dre = scan.nextInt();
                    System.out.println("A que capacidad uso del drenaje? 0-100");
                    int cap = scan.nextInt();
                    if (cap >= 0 && cap <= 100){
                        int total = comunity[comu].getDrenajes(dre)+ cap;
                        if (total>= 0 && total<= 100){
                            comunity[comu].setDrenajes(total, dre);
                        }
                        else{
                            System.out.println("Esa opcion de capacidad no es valida");
                        }
                        
                    }
                    else{
                        System.out.println("Esa opcion de capacidad no es valida");
                    }
                    break;
                case 2:
                    //VACIAR DRENAJES
                    a = 0;
                    System.out.println("Seleccione la comunidad que vaciara el drenaje");
                    for (int i = 0; i<comunity.length; i++){
                        System.out.println(i +" Nombre: "+ comunity[i].getNombre() + "| Cantidad de personas: "+ comunity[i].getPersonas());
                        a++;
                    }
                    a = 0;
                    comu = scan.nextInt();
                    System.out.println("Seleccione el drenaje que vaciara");
                    for (int i = 0; i<3; i++){
                        System.out.println("Drenaje "+a+" : " + comunity[comu].getDrenajes(i)+"%");
                        a++;
                    }
                    dre = scan.nextInt();
                    System.out.println("cuanto vaciara el drenaje? 0-100");
                    cap = scan.nextInt();
                    if (cap >= 0 && cap <= 100){
                        int total = comunity[comu].getDrenajes(dre)- cap;
                        if (total>= 0 && total<= 100){
                            comunity[comu].setDrenajes(total, dre);
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