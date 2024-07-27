package july27;

public class DecisionDemo {

    public static void main(String[] args) {
        int score = 20;

        if(score >= 0 && score <=40) {
            System.out.println("Fail");
        }
        else if(score >40 && score <= 50) {
            System.out.println("C grade");
        }
        else if(score >50 && score <= 60) {
            System.out.println("C + Grade");
        }
        else if(score >60 && score <= 70) {
            System.out.println("B  Grade");
        }
        else if(score >70 && score <= 80) {
            System.out.println("B+ Grade");
        }
        else if(score >80 && score <= 90) {
            System.out.println("A Grade");
        }
        else if(score >90 && score <= 100) {
            System.out.println("A + Grade");
        }
        else {
            System.out.println("....");
        }


        /*
        Bread

        Walmart  - Bread
        Loblaws
        Metro
        FoodBasic
        Costco
        Freshco
        Pragrco





  Grading System
      int score = 50;
      1. 0-40 --- Fail
      2. 40 -50 - C grade
      2. 50 -60 - C+ grade
      2. 60 -70 - B grade
      2. 70 -80 - B+ grade
      2. 80 -90 - A grade
      2. 00 -100 - A+ grade

       1. 0-16 , not eligible to drive
       2. 16-19 , you can have learners license
       3. greater than 19 - eligible to drive without any restrictions





         */


    }
}
