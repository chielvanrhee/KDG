package Weken.D_ExceptionHandeling.BoekOpdrachten.OpdrachtTwee;

public class CustomException extends Exception {
    public CustomException(){
        super();
    }
    public CustomException(String s){
        super(s);
    }
    public  CustomException(String s, Throwable c){
        super(s,c);
    }
    public CustomException(Throwable c){
        super (c);
    }
}
