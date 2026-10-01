package task1;

import java.util.Scanner;

public class LibraryAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter average books read per month: ");
        int v = input.nextInt();

        System.out.print("Enter average visitors per year: ");
        int n = input.nextInt();

        double k = (v * 12.0) / n;

        System.out.println("Average books read per visitor per year: " + k);

        input.close();
    }
}
