package sep7.exception;

public class Registration {

//    String firstName = "Favour";
//    String lastName = "Ojo";

    public static void validateName(String firstName, String lastName) {
        try {
            firstName = null;
            String returnNameInUpperCase = firstName.toUpperCase() + " " + lastName.toUpperCase();
            System.out.println("Name in upper class : " + returnNameInUpperCase);
        }catch (NullPointerException e) {
          e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        validateName("Favour", "Ojo");

        System.out.println(" Calcuting some after this.. ");
    }
}

// sample problem
// take user input , Number 1 and Number 2
// number1/ number 2
// number = 0 


