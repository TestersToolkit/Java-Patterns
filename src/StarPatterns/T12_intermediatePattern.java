package StarPatterns;

import java.util.Scanner;


// www.youtube//testerstoolkit
public class T12_intermediatePattern {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("How much rows would you like to print?");

        int num= scan.nextInt();

        System.out.println(" Great!!! Here is your pattern....!!!");
        System.out.println();

        for (int i = 1; i <=num ; i++) { //rows
            for (int j = 2*num-i; j >i ; j--) { // columns
                System.out.print(" ");
            }
            for (int j =1; j <=i ; j++) { //columns
                System.out.print(j + " ");

            }
            System.out.println();

        }
        scan.close();


    }

}
/*
12. Print the following pattern
            1
          1 2
        1 2 3
      1 2 3 4
    1 2 3 4 5
  1 2 3 4 5 6
1 2 3 4 5 6 7

 */
