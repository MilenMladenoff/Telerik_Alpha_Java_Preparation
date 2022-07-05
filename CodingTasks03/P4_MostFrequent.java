package CodingTasks03;

import java.util.Arrays;
import java.util.Scanner;

public class P4_MostFrequent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(scan.nextLine());
        }

        Arrays.sort(numbers);
        int mostFrequentNumber = 0;
        int maxRepeatedTimes = 1;
        int repeatingCounter = 1;

        for (int i = 1; i < n; i++) {

            if (numbers[i] == numbers[i - 1]) {
                repeatingCounter++;
            } else {
                repeatingCounter = 1;
            }

            if (repeatingCounter > maxRepeatedTimes) {
                maxRepeatedTimes = repeatingCounter;
                mostFrequentNumber = numbers[i];
            }
        }

        System.out.printf("%d (%d times)%n", mostFrequentNumber, maxRepeatedTimes);
    }
}
