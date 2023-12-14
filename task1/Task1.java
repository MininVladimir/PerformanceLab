package taskPackage;

import java.util.Scanner;
public class Task1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            System.out.print("Enter n: ");
            var n = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter m: ");
            var m = Integer.parseInt(scanner.nextLine());

            var array = new int[n];
            for (var i = 0; i < n; i++) {
                array[i] = i + 1;
            }

            var current = 0;
            do {
                System.out.print(array[current]);
                current = (current + m - 1) % n;
            } while (current != 0);
            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}