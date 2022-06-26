package CodingTasks01;

import java.util.Scanner;

public class P1_Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputNum = scan.nextLine();
        int firstDigit = Integer.parseInt(String.valueOf(inputNum.charAt(0)));
        int secondDigit = Integer.parseInt(String.valueOf(inputNum.charAt(1)));
        int thirdDigit = Integer.parseInt(String.valueOf(inputNum.charAt(2)));

        int combination1 = firstDigit + secondDigit + thirdDigit;
        int combination2 = firstDigit * secondDigit * thirdDigit;
        int combination3 = firstDigit + secondDigit * thirdDigit;
        int combination4 = firstDigit * secondDigit + thirdDigit;

        System.out.println(Math.max(combination1, Math.max(combination2, Math.max(combination3, combination4))));
    }
}
