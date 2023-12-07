package StarPatterns;

public class T10_intermediatePattern {
    public static void main(String[] args) {
        //Printing upper half of the pattern
        int num = 7;
        for (int i = num; i >= 1; i--) { //rows
            for (int j = 1; j <= i; j++) { //columns
                System.out.print(j + " ");

            }
            System.out.println();

        }
        for (int i = 2; i <= 7; i++) { //rows
            for (int j = 1; j <= i; j++) { //columns
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }
}









/*
10. Print the following pattern

1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7

 */
