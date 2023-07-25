public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(isPalindrone(122));
        System.out.println(isPerfectNumber(6));
    }

    public static boolean isPalindrone(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    public static boolean isPerfectNumber(int number) {
        if(number <= 0) {
            return false;
        }

        int sumOfdiv = 0;
        for(int i = 1; i <= number / 2; i++) {
            if(number % i == 0) {
                sumOfdiv += i;
            }
        }

        return sumOfdiv == number;
    }


}