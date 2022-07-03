package CodingTasks02;

import java.util.Scanner;

public class P2_ForestRoad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int rows = 1; rows <= n; rows++) {

            for (int cols = 1; cols <= n; cols++) {

                if (cols != rows) {
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        for (int rows = n - 1; rows > 0; rows--) {

            for (int cols = 1; cols <= n; cols++) {

                if (cols != rows) {
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
