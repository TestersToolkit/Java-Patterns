package StarPatterns;

public class T03_rightAngleColumns {
    public static void main(String[] args) {
         int num=7;

        for (int i = 1; i <=num ; i++) { //rows
            for (int j = 1; j <=i ; j++) { //columns

                System.out.print(j + " ");

            }
            System.out.println();

        }

    }
}

/*
3. print a right angle triangle where it prints the column number

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
 */