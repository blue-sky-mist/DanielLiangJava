package daniel.liang.chapter2;

import java.util.Scanner;

public class ComputeAreaWIthConsoleInput {
    public static void main(String[] args) {
        double circleRadius;
        double circleArea;
        Scanner input = new Scanner(System.in);
        circleRadius = input.nextDouble();
        circleArea = circleRadius*circleRadius*3.14;
        System.out.println("The area of the circle with radius " + circleRadius +  " is :" + circleArea);
    }
}
