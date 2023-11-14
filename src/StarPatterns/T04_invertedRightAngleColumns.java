package StarPatterns;

public class T04_invertedRightAngleColumns {
    public static void main(String[] args) {
        int num=7;

        for (int i = num; i >=1 ; i--) { // rows
            for (int j = 1; j <=i ; j++) { // columns

                System.out.print(j + " ");

            }
            System.out.println();
        }

    }


}

/*
4. print an inverted right angle triangle where it prints the column number
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */
