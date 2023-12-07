package StarPatterns;

import java.util.Scanner;

public class T14_intermediatePattern {
    public static void main(String[] args) {
        // www.youtube/@TestersToolkit1

        Scanner scan =new Scanner(System.in);
        System.out.println("How many rows would you like to print?");

        int num= scan.nextInt();
        System.out.println(" Great!!! Here is your pattern....!!!");
        System.out.println();
        // www.youtube/@TestersToolkit1

        for (int i = 1; i <=num ; i++) { //rows

            for (int j = 2*num-i; j > i; j--) { //blank columns
                System.out.print("*");
                // 1st .........2*7-i ---> 14-1 = 13 ----13 spaces
                //7th ..........2*7-7----> 7

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
14. Print the following pattern

            1
          2 1
        3 2 1
      4 3 2 1
    5 4 3 2 1
  6 5 4 3 2 1
7 6 5 4 3 2 1

 */