package CodingTasks01;

import java.util.Scanner;

public class P3_MirrorCodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] numbers = scan.nextLine().split(" ");

        int number1 = Integer.parseInt(getNumberReversed(numbers[0]));
        int number2 = Integer.parseInt(getNumberReversed(numbers[1]));
        System.out.println(Math.max(number1, number2));
    }

    private static String getNumberReversed(String number) {
        StringBuilder numberReversed = new StringBuilder();

        for (int i = number.length() - 1; i >= 0; i--) {
            numberReversed.append(number.charAt(i));
        }

        return numberReversed.toString();
    }
}
