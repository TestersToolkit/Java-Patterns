package StarPatterns;

import java.util.Scanner;

// www.youtube//testers_toolkit
public class T13_intermediatePattern {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("How much rows would you like to print?");

        int num= scan.nextInt();

        System.out.println(" Great!!! Here is your pattern....!!!");
        System.out.println();

        for (int i = num; i >=1 ; i--) { //rows
            for (int j = 2*num -i; j > i ; j--) { //blank columns
                System.out.print(" ");

// www.youtube//testers_toolkit

            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");

            }
            System.out.println();

        }
        scan.close();





        scan.close();
    }
}
// www.youtube//testers_toolkit

/* 13. Print the following pattern

1 2 3 4 5 6 7
  1 2 3 4 5 6
    1 2 3 4 5
      1 2 3 4
        1 2 3
          1 2
            1


 */
