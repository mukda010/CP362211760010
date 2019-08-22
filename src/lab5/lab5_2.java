package lab5;

import java.util.Scanner;

public class lab5_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double PI = 3.14;

        System.out.println("Enter: ");
        double r = scan.nextDouble();

        double Area = PI * r*r;
        System.out.println("Circle round: "+ Area);

        double c = 2* PI *r;
        System.out.println("Circle round: "+ c);

        double v = (4/3) *PI*r*r*r;
        System.out.println("Circle round: "+ v);

    }


}
