package task4;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first side: ");
        double a = input.nextDouble();

        System.out.print("Enter second side: ");
        double b = input.nextDouble();

        System.out.print("Enter third side: ");
        double c = input.nextDouble();

        double s = (a + b + c) / 2;

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Area of triangle = " + area);

        input.close();
    }
}
