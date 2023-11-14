package StarPatterns;

public class T07_Pattern {
    public static void main(String[] args) {
        int num=7;

        for (int i = 1; i <= num; i++) { //rows
            for (int j = i; j >=1 ; j--) { //columns

                System.out.print(j + " ");

            }
            System.out.println();

        }

    }
}
/*
7. Print the following pattern

1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
6 5 4 3 2 1
7 6 5 4 3 2 1

 */

