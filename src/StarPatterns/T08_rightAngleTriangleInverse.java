package StarPatterns;

public class T08_rightAngleTriangleInverse {
    public static void main(String[] args) {
        int num=7;

        for (int i = num; i >=1 ; i--) { //rows
            for (int j = i; j >=1 ; j--) { //columns

                System.out.print(j + " ");

            }
            System.out.println();

        }

    }
}

/*
8. Print the following pattern

7 6 5 4 3 2 1
6 5 4 3 2 1
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
 */
