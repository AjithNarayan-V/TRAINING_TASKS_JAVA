import java.util.Scanner;

public class Collection_linked_list {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Binary: " + toBinary(number));
        System.out.println("Octal: " + toOctal(number));
        System.out.println("Decimal: " + number);
        System.out.println("Hexadecimal: " + toHexadecimal(number));
    }

    public static String toBinary(int number) {
        return convertToBase(number, 2);
    }

    public static String toOctal(int number) {
        return convertToBase(number, 8);
    }

    public static String toHexadecimal(int number) {
        return convertToBase(number, 16);
    }

    public static String convertToBase(int number, int base) {
        StringBuilder result = new StringBuilder();
        while (number > 0) {
            int remainder = number % base;
            if (remainder < 10) {
                result.insert(0, remainder);
            } else {
                result.insert(0, (char) ('A' + remainder - 10));
            }
            number /= base;
        }
        return result.toString();
    }
}