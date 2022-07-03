package CodingTasks02;

import java.util.Scanner;

public class P5_GoodNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();
        int goodNumbersCount = 0;

        for (int i = start; i <= end; i++) {
            boolean isGoodNumber = true;
            int currentNumber = i;

            while (currentNumber >= 1) {
                int digit = currentNumber % 10;

                if (digit > 0 && i % digit != 0) {
                    isGoodNumber = false;
                    break;
                }

                currentNumber /= 10;
            }

            if (isGoodNumber) {
                goodNumbersCount++;
            }
        }

        System.out.println(goodNumbersCount);
    }
}
