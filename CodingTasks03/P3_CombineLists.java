package CodingTasks03;

import java.util.Arrays;
import java.util.Scanner;

public class P3_CombineLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr1 = Arrays.stream(scan.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(scan.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ",");

            if (i == arr1.length - 1) {
                System.out.print(arr2[i]);
            } else {
                System.out.print(arr2[i] + ",");
            }
        }
    }
}
