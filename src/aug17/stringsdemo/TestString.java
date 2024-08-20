package aug17.stringsdemo;

public class TestString {
    public static void main(String[] args) {

        String s1 = "Pragra";
        s1 = null;
        System.out.println(s1.toString());
    }
}
/*

  Object - Super class
  |
  String    [toString()]    -- -


  Object
    |
  Student [] - no toString()
 */