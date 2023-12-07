package StarPatterns;

import java.util.Scanner;

public class T15_intermediate {
    public static void main(String[] args) {
        // www.youtube/@TestersToolkit1

        Scanner scan = new Scanner(System.in);
        System.out.println("How many rows would you like to print?");

        int num = scan.nextInt();
        System.out.println(" Great!!! Here is your pattern....!!!");

        System.out.println();
        // www.youtube/@TestersToolkit1

        for (int i = num; i >=1; i--) { //rows
            for (int j = 2*num-i; j > i ; j--) { //blank columns
                System.out.print(" ");

            }
            for (int j = i; j >=1 ; j--) { //numbered columns
                System.out.print(j + " ");

            }
            System.out.println();
        }

        scan.close();
    }
    // www.youtube/@TestersToolkit1
}
/*
15. Print the following pattern


 7 6 5 4 3 2 1
   6 5 4 3 2 1
     5 4 3 2 1
       4 3 2 1
         3 2 1
           2 1
             1

 */