package CodingTasks01;

import java.util.Scanner;

public class P2_ElectronicMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int brokenCharsCounter = 0;
        int maxBrokenCharsSequence = 0;

        for (int i = 0; i < input.length() - 1; i++) {
            char currentChar = input.toLowerCase().charAt(i);

            if ((currentChar < 97 || 122 < currentChar) && (currentChar < 48 || 57 < currentChar) && currentChar != 32) {
                brokenCharsCounter++;
            } else {
                brokenCharsCounter = 0;
            }

            if (brokenCharsCounter > maxBrokenCharsSequence) {
                maxBrokenCharsSequence = brokenCharsCounter;
            }
        }

        System.out.println(maxBrokenCharsSequence);
    }
}
