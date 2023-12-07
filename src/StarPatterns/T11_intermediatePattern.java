package StarPatterns;

import java.util.Scanner;

public class T11_intermediatePattern {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("How much rows would you like to print?");

        int num= scan.nextInt();

        System.out.println(" Great!!! Here is your pattern....!!!");

        for (int i = 1; i <=num ; i++) { //rows
            for (int j = 1; j <=i ; j++) { //columns
                System.out.print(j+ " ");
            }
            for (int j = i-1; j >=1 ; j--) { //columns
                System.out.print(j+ " ");
            }

            System.out.println();

        }

    }
}

/*
11. Print the following pattern taking a user input

        1
        1 2 1
        1 2 3 2 1
        1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
        1 2 3 4 5 6 5 4 3 2 1
        1 2 3 4 5 6 7 6 5 4 3 2 1

 */