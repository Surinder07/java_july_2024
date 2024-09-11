package sep10.customexp;

public class Bank {

    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }
    // withdraw
    public double withdraw(double withdraw){
        if(balance < withdraw) {
            // creating my own exception...
            // throw your own exception ....
            // divide by zero
            // Customized exceptoin
             throw new InsufficientBalanceException("You can not withdraw more money than you have..");
        }
        balance = balance - withdraw;

        return balance;
    }

    // deposit
    public double deposit(double deposit){
        balance = balance + deposit;
        return balance;
    }

    // Balance
    public double getBalance() {
        return balance;
    }
}


//  Create a product catalog
// ProductNotFoundException.
// if user try to add a product to cart which is not present
// throw ProductNotFoundException and handle it as well...