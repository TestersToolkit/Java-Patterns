package StarPatterns;

public class T05_Pattern {
    public static void main(String[] args) {
        int num=7;

        for (int i = num; i >=1 ; i--)
        { // rows
            for (int j = num; j >=i ; j--)
            { //columns

                System.out.print(j + " ");
            }
            System.out.println(); //lines

        }


    }
}

/*
5.  Print the following pattern

7
7 6
7 6 5
7 6 4 5
7 6 5 4 3
7 6 5 4 3 2
7 6 5 4 3 2 1
 */
