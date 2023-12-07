package StarPatterns;

public class T09_intermediatePattern {
    public static void main(String[] args) {
        int num=7;

        //first  part of the pattern
        for (int i = 1; i <=7 ; i++) { //rows
            for (int j = 1; j <=i; j++) { //columns

               System.out.print( j + " ");
                //System.out.print(  "* ");
            }
            System.out.println();

        }
        for (int i = num-1; i >=1 ; i--) { //rows
            for (int j = 1; j <=i; j++) { //columns

                System.out.print( j + " ");
               // System.out.print(  "* ");
            }
            System.out.println();

        }


    }
}

/*
9. Print the following pattern

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */
