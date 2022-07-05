package CodingTasks03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P1_ArraySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(","))
                .map(Integer::parseInt).collect(Collectors.toList());

        StringBuilder output = new StringBuilder();

        for (int i = 1; i <= numbers.size(); i++) {

            if (!numbers.contains(i)) {
                output.append(i).append(",");
            }
        }

        if (output.length() > 0) {
            output.replace(output.length() - 1, output.length(), "");
        }

        System.out.println(output);
    }
}
