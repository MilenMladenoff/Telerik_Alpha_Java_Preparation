package CodingTasks02;

import java.util.Scanner;

public class P4_SignalFromSpace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputMessage = scan.nextLine();
        StringBuilder decodedMessage = new StringBuilder();
        decodedMessage.append(inputMessage.charAt(0));

        for (int i = 1; i < inputMessage.length(); i++) {
            char currentChar = inputMessage.charAt(i);

            if (currentChar != decodedMessage.charAt(decodedMessage.length() - 1)) {
                decodedMessage.append(currentChar);
            }
        }

        System.out.println(decodedMessage);
    }
}
