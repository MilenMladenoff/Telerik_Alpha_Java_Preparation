package CodingTasks01;

import java.util.Arrays;
import java.util.Scanner;

public class P4_Arrangement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] heights = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        if (heights[0] < heights[1] && heights[1] < heights[2] && heights[2] < heights[3]) {
            System.out.println("Ascending");
        } else if (heights[0] > heights[1] && heights[1] > heights[2] && heights[2] > heights[3]) {
            System.out.println("Descending");
        } else {
            System.out.println("Mixed");
        }
    }
}
