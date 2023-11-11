package StarPatterns;

public class T01_rightAngleTriangle {
    public static void main(String[] args) {
        int num=7;

        for (int i = 1; i <=7 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i + " ");

            }
            System.out.println();
        }
    }

}
/*
1. Write a program that takes X number from the user and prints out right-angled triangle pattern.

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
7 7 7 7 7 7 7
 */