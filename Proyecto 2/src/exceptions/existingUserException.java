package exceptions;

public class existingUserException extends Exception{
    
    public existingUserException(){
        super("El usuario ya existe");
    }

}