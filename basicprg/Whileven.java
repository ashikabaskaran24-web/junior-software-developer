import java.util.Scanner;

class Whileven {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        long n1 = s1.nextLong();
        long b;
        long even = 0;
        long odd = 0;
        int count1 = 0;
        int count2 = 0;
        long sum1 = 0;
        long sum2 = 0;
        long pEven = 1;
        long pOdd = 1;

        while (n1 != 0) {
            b = n1 % 10;

            if (b % 2 == 0) {
                even = b * pEven + even;
                pEven = pEven * 10;

                count1++;
                sum1 = sum1 + b;
            } else {
                odd = b * pOdd + odd;
                pOdd = pOdd * 10;
                count2++;
                sum2 = sum2 + b;
            }

            n1 = n1 / 10;
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        System.out.println("Even count: " + count1);
        System.out.println("Odd count: " + count2);
        System.out.println("Even sum: " + sum1);
        System.out.println("Odd sum: " + sum2);
    }
}