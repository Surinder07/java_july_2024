package aug12;

public class MultiDimensionArray {
    public static void main(String[] args) {

        // maxtrix
        int[][] arr = new int[3][4];
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;
        arr[0][3] = 1000;
        arr[1][0] = 40;
        arr[1][1] = 50;
        arr[1][2] = 60;
        arr[1][3] = 2000;
        arr[2][0] = 70;
        arr[2][1] = 80;
        arr[2][2] = 90;
        arr[2][3] = 1000;


        // nested loops
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.println(arr[i][j]);
            }

        }

        /*
        10 20 30             20 10 30       30 30 60
        20 30 10     +       10 25 25   =   30 55 35
        20 30 10             50 10 25       70 40 35






         */





    }
}
