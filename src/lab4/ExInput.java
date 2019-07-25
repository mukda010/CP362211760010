package lab4;

import java.util.Scanner;

public class ExInput {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Pleare.enter an integer:");
        int x = scanner.nextInt();

        System.out.println("Your entered integer: "+x);

        //input double
        System.out.print("Pleare.enter an integer2:");
        double b = scanner.nextDouble();

        //input string
        System.out.println("Your entered integer2:"+b);
        System.out.println("Pleare,enter you name: ");
        String s = scanner.nextLine();

        System.out.println("You name is:"+s);









    }
}
