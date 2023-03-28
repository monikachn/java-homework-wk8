package homeworkwk8;

import java.util.Scanner;

/**
 * 8. Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class P8_RightAngleTriangle {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int numStar;

            System.out.print("Number of stars: ");
            numStar = input.nextInt();

            while (numStar < 1 && numStar > 20) {
                System.out.println("Enter a valid number ");
                numStar = input.nextInt();
            }

            for (int i = 1; i <= numStar; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("@");
                }
                System.out.println();
            }
        }
    }


