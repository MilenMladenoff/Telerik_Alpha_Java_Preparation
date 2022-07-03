package CodingTasks02;

import java.util.Scanner;

public class P3_LeastMajorityMultiple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scan.nextLine());
        }

        int leastMajorityMultipleCount = 0;
        int dividend = 0;

        do {
            dividend++;
            leastMajorityMultipleCount = 0;

            for (int i = 0; i < numbers.length; i++) {

                if (dividend % numbers[i] == 0) {
                    leastMajorityMultipleCount++;
                }
            }

        } while (leastMajorityMultipleCount < 3);

        System.out.println(dividend);
    }
}
