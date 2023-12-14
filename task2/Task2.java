package taskPackage;

import java.io.File;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter circle file path: ");
            var circleFilePath = scanner.nextLine();
            System.out.print("Enter points file path: ");
            var pointsFilePath = scanner.nextLine();
            scanner.close();

            Scanner circleScanner = new Scanner(new File(circleFilePath));
            var centerX = circleScanner.nextFloat();
            var centerY = circleScanner.nextFloat();
            var radius = circleScanner.nextFloat();
            circleScanner.close();

            Scanner pointsScanner = new Scanner(new File(pointsFilePath));
            var numberOfPoints = 0;
            while (pointsScanner.hasNextFloat()) {
                var pointX = pointsScanner.nextFloat();
                var pointY = pointsScanner.nextFloat();
                ++numberOfPoints;

                if (numberOfPoints > 100) {
                    System.out.println("100 points processed. Total points: " + numberOfPoints);
                } else {
                    var distance = (float) Math.sqrt(Math.pow(pointX - centerX, 2) +
                                                     Math.pow(pointY - centerY, 2));

                    if (distance < radius) {
                        System.out.println("1" + "\n");
                    } else if (distance == radius) {
                        System.out.println("0" + "\n");
                    } else {
                        System.out.println("2" + "\n");
                    }
                }
            }
            pointsScanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}