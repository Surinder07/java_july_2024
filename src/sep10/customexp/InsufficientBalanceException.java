package sep10.customexp;

public class InsufficientBalanceException extends RuntimeException{
    InsufficientBalanceException(String message){
        super(message);
    }
}