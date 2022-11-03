package exceptions;

public class maxCharException extends Exception{
    
    public maxCharException(){
        super("El mensaje supera los 30 caracteres de largo");
    }

}