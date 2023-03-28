package homeworkwk8;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
  17.... are the prime numbers.)
 */
public class P12_PrimeNumberOrNot {
    public static void main(String[] args) {
        int num, b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter A Number");

        num =scanner.nextInt();
        b=1;
        c=0;
        while(b<= num)
        {
            if((num%b)==0)
                c=c+1;
            b++;
        }
        if(c==2)
            System.out.println(num +" is a prime number");
        else
            System.out.println(num +" is not a prime number");
    }
}
