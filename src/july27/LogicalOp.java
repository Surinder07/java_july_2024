package july27;

public class LogicalOp {
    public static void main(String[] args) {

        int x = 20;
        int y = 20;
        int a = 25;
        int b = 15;

                        // false   ||  false
        System.out.println((x > y) || (a < b));

        System.out.println((x >= y) && (a == b));  // false

        System.out.println(!((y <= y) && (a == b)));  // true

        System.out.println((x > y) || (a <= b));  // false

        System.out.println((x > y) && (a >= b));  // false

        System.out.println(!(x <= y) || (a >= b)); //true


        //  x = x + y;
        // x+=y


    }
}




 /*
           && - AND
           1st       2nd      result
           True     False     False
           False    True      False
           True     True      True
           False    False     False

           ||  -  OR
           True     False      True
           False    True       True
           True     True       True
           False    False      False


           ! NOT
           opposite
           True    -- false
           false  -- true


         */


