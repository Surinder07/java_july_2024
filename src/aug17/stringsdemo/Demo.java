package aug17.stringsdemo;

public class Demo {
    public static void main(String[] args) {

        // s(int srcBegin, int srcEnd, char dst[], int dstBegin) {
        String email = "abc@gmail.com";
        char[] charArray = new char[5];
        email.getChars(0, 5, charArray,0 );

        System.out.println(charArray);



        /*

            String companyName = "Pragra"  --> argarP
            Reverse the string ?


         */

    }
}
