package CodingTasks01;

import java.util.Scanner;

public class P5_CheckForPlayCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        char firstChar = input.charAt(0);

        if (input.length() == 1 && ((firstChar > 49 && firstChar < 58)
                || firstChar == 65 || firstChar == 74 || firstChar == 75 || firstChar == 81)) {

            System.out.printf("yes %c", firstChar);
        } else if (input.equals("10")) {
            System.out.println("yes 10");
        } else {
            System.out.printf("no %s", input);
        }
    }
}
