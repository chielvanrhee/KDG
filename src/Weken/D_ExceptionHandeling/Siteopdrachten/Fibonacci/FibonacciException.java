package Weken.D_ExceptionHandeling.Siteopdrachten.Fibonacci;

public class FibonacciException extends ArithmeticException {

    public FibonacciException(){
        super();
    }
    public FibonacciException(String msg){
        super(msg);
    }

}
