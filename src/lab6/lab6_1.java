package lab6;

import java.util.Scanner;

public class lab6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c;
        System.out.print("Input a degree in Celsius: ");
        c = sc.nextDouble();
        double f = (9*c+(32*5)); // c*9/5+32

        System.out.println(c+ "degree Celsius is "+f+" in Fahrenheit");





    }

}
