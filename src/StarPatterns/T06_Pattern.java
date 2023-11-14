package StarPatterns;

public class T06_Pattern {
    public static void main(String[] args) {
         int num=7;

        for (int i = 1; i <=num ; i++) { //rows
            for (int j = num; j >=i ; j--) { //columns

                System.out.print( j + " ");

            }
            System.out.println(); //lines

        }





    }
}


/*
6. Print the following pattern

7 6 5 3 2 4 1
7 6 5 4 3 2
7 6 5 4 3
7 6 5 4
7 6 5
7 6
7
 */
