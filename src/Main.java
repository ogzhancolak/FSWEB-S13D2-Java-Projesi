import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(isPalindrone(122));
        System.out.println(isPerfectNumber(6));
        System.out.println(numberToWords(123));
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

    public static String numberToWords(int number) {
        if(number < 0) {
            return "Invalid Value";
        }

        HashMap<Character, String> digitsText = new HashMap<>();
        digitsText.put('0', "Zero");
        digitsText.put('1', "One");
        digitsText.put('2', "Two");
        digitsText.put('3', "Three");
        digitsText.put('4', "Four");
        digitsText.put('5', "Five");
        digitsText.put('6', "Six");
        digitsText.put('7', "Seven");
        digitsText.put('8', "Eight");
        digitsText.put('9', "Nine");

        String numberStr = String.valueOf(number);
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < numberStr.length(); i++) {
            char digitChar = numberStr.charAt(i);
            String text = digitsText.get(digitChar);
            result.append(text).append(" ");
        }

        return result.toString().trim();
    }


}