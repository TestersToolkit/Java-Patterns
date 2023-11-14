package StarPatterns;

public class T02_invertedRightAngle {
    public static void main(String[] args) {

        int num=7;

        for (int i = num; i >=1 ; i--) { //rows
            for (int j = 1; j <=i ; j++) { //columns
               System.out.print(i + " ");
                //System.out.print("* ");


            }
            System.out.println();
        }
    }
}
/*
 Print an inverted right-angled triangle pattern of stars.

 */

