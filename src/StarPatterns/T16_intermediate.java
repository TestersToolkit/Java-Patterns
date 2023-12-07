package StarPatterns;

import java.util.Scanner;

public class T16_intermediate {
    public static void main(String[] args) {


        // www.youtube/@TestersToolkit1

        Scanner scan = new Scanner(System.in);
        System.out.println("How many rows would you like to print?");

        int num = scan.nextInt();
        System.out.println("Great!!! Here is your pattern....!!!");

        System.out.println();
        for (int i = 1; i <=num ; i++) { // rows
            for (int j = 1; j < i ; j++) { //blank columns
                System.out.print(" ");
            }
            for (int j = i; j <=num ; j++) {//numbered columns
                System.out.print(j);
            }
            System.out.println();

            //second half
        }
        for (int i = num-1; i >=1 ; i--) {// rows

            for (int j = 1; j < i ; j++) { //blank columns
                System.out.print(" ");
            }
            for (int j = i; j <=num ; j++) { //numbered columns
                System.out.print(j);

            }
            System.out.println();

        }
scan.close();
        // www.youtube/@TestersToolkit1


    }
}
/*
16. Print the following pattern

1234567
 234567
  34567
   4567
    567
     67
      7

     67
    567
   4567
  34567
 234567
1234567
 */