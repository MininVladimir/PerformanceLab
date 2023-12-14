package taskPackage;

import java.io.File;
import java.util.*;
public class Task4 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter file path: ");
            var filePath = scanner.nextLine();
            scanner.close();

            Scanner fileScanner = new Scanner(new File(filePath));
            List<Integer> myList = new ArrayList<>();
            while (fileScanner.hasNext()) {
                if (fileScanner.hasNextInt()) {
                    myList.add(fileScanner.nextInt());
                } else {
                    fileScanner.next();
                    System.out.println("Not integer number was skipped" + "\n");
                }
            } fileScanner.close();

            Collections.sort(myList);
            var m = myList.get(myList.size() / 2);
            myList.remove(myList.size() / 2);

            var steps = 0;
            for (int i : myList) {
                if(i < m){
                    steps += m - i;
                } else steps += i - m;
            }
            System.out.println(steps);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}