package homeworkwk8;

/**
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */
public class P11_EvenDigitSum {
    public static void main(String[] args) {

        System.out.println("getEvenDigitSum(123456778) " + getEvenDigitSum(123456789));
        System.out.println("getEvenDigitSum(252) " + getEvenDigitSum(252));
        System.out.println("getEvenDigitSum(-22) " + getEvenDigitSum(-22));

    }

    private static int getEvenDigitSum(int number) {

        if(number < 0){
            return -1;
        }

        int n = number; // copied number into variable
        int sum = 0;

        while (n != 0) {
            int digit = n % 10; //remainder
            if(digit%2==0) { //remainder is 0
                sum = sum + digit;
            }
            n = n / 10;
        }
        return sum;
    }
}
