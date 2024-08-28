package aug27.passwordmanager;

public class LoginAppMain {
    public static void main(String[] args) {
        PasswordManager passwordManager = new PasswordManager("pragra","pragra123"); // existing user creds..
       // passwordManager.isUserAuthenticated("pragra","pragra123");

        // Some hacker...

        passwordManager.setPassword("mypassword");

        System.out.println(passwordManager);
        passwordManager.isUserAuthenticated("pragra","mypassword");


        // 10 -15 mins
        //  read only file
        // write only file
        // read and write both
        // boolean isRead;
        // boolean isWritable;



        /*
        fields
      private   accountHolderName
        priavte balance

        1. deposit
        2. withdraw
        3. get the current balance
        4. get the account holder name





         */




    }
}
