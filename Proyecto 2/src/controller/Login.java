package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import model.Administrador;
import model.Usuario;
import controller.UsuarioCSV;
import controller.Persistencia;
import java.util.ArrayList;
import java.util.Scanner;


/*
 * @author Sharis Barrios
 * @author Gabriel Paz
 * @author Oscar Fuentes
 * @author David Trujillo
 * @date 06- 10 - 2022
 * La clase login almacena los métodos necesarios para que un usuario se registre y se logee.
 */


/**
 * @author gabrielpaz
 */
public class Login {

    private static Scanner entrada = new Scanner(System.in);
    public static ArrayList<Usuario> users = new ArrayList<>();
    UsuarioCSV usuario = new UsuarioCSV("usuarios", "usuarios",users);
    
    

    /**
     * Setter para users
     * @param users
     */


    /**
     * @author gabrielpaz
     * El metodo registra a un nuevo usuario en la plataforma.
     */
    
    public static void Registrar() {
        
        while (true) {
            System.out.println("Ingrese su nombre de usuario");
            String newUser = entrada.nextLine();
            Persistencia archivo = new Persistencia();

            if (userExists(users, newUser)) {
                System.out.println("El usuario ya existe, intente con otro :*(\n");
            } else {

                System.out.println("Usuario " + newUser + " aceptado :)");
                System.out.println("Ingrese su nueva contrasena");
                String contasena = entrada.nextLine();
                users.add(new Usuario(newUser,contasena));

                //Se guarda usuario y contraseña encriptada en csv
                String linea = newUser +", " + contasena;
                archivo.editarArchivo("usuarios", linea);
                System.out.println(newUser + " te has registrado exitosamente! :)\n");
                break;
            }
        }

        //Control point
        System.out.println("Mostrando usuarios");
        for(Usuario usuario: users){
            System.out.println(usuario.getNombreUsuario());
        }
    }

    /**
     * Método de logeo, pend
     * @return
     */

    public void leerArchivo(){
        FileReader fr;
        try {
            fr = new FileReader("usuarios");
            String linea = "";
            BufferedReader br = new BufferedReader(fr);
            while((linea = br.readLine()) != null){
                String[] datoslinea = linea.split(";");
                String NombreUsuario = datoslinea[0].trim();
                String Contrasena = datoslinea[1].trim();
                Usuario u = new Usuario(NombreUsuario, Contrasena);
                this.users.add(u);
            }
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        } 
    }
     
    public static int login(){
        
        while (true) {
            System.out.println("Ingrese su nombre de usuario");
            String user = entrada.nextLine();

            if (userExists(users,user)){
                System.out.println("Usuario encontrado :)");
                System.out.println("Ingrese la su contrasena");
                String contrasena = entrada.nextLine();

                //Logeo exitoso sin encriptado

                if (getUser(user,users).getContrasena().equals(contrasena)){
                    System.out.println("Logeado exitosamente");

                    //Return index del usuario logeado
                    return users.indexOf(getUser(user,users));

                } else{
                    System.out.println("Contrasena incorrecta");
                }
            } else{
                System.out.println("Usuario no encontrado :(");
            }
        }

    }

    /**
     * @author gabrielpaz
     * Método verifica si un usario esta resgistrado o no.
     * @param usuarios
     * @param newUser
     * @return bool
     */
    public static boolean userExists(ArrayList<Usuario> usuarios,String newUser){
        for(int i = 0;i<usuarios.size();i++){
            if (usuarios.get(i).getNombreUsuario().equals(newUser)){
                return true;
            }
            }
        return false;
    }

    /**
     * @author gabrielpaz
     * Método que construye al usuario administrador.
     */
    public static void setAdminUser(){
        Administrador adminUser = new Administrador("admin","admin");
        users.add(adminUser);
    }

    /**
     * @author gabrielpaz
     * El metodo retorna el objeto de usuario dado su nombre
     * @param UserName
     * @param users
     * @return
     */
    public static Usuario getUser(String UserName, ArrayList<Usuario> users){
        for(int i = 0;i<users.size();i++) {
            if (users.get(i).getNombreUsuario().equals(UserName)) {
                return users.get(i);
            }
        }
        return null;
    }

    /**
     * @author gabrielpaz
     * Getters para user
     * @return
     */
    public static ArrayList<Usuario> getUserList(){
        return users;
    }

}

