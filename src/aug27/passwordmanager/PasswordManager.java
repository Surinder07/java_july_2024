package aug27.passwordmanager;

public class PasswordManager {
    private String userName;
    private String password;

    public PasswordManager(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void isUserAuthenticated(String userName, String password){
        if(this.userName.equalsIgnoreCase(userName) && this.password.equalsIgnoreCase(password)){
            System.out.println("User is Authenticated...");
            System.out.println("Welcome to my App " + userName);
        }
        else {
            System.err.println("Invalid user credentials, please try again ! ");
        }

    }

    @Override
    public String toString() {
        return "PasswordManager{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    // inner class
    static class Test {

    }
}
