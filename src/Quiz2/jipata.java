package Quiz2;

import org.omg.CORBA.portable.ValueOutputStream;

import java.util.Scanner;

public class jipata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to Continue (Y/N):");
        char c=sc.nextInt().charAt(0);
        if (c =='Y'|| c=='y')showOption();
        else {
            System.out.println("Good Bye.");
            System.exit(1);{
            }
        }



        System.out.println("###Welcome to Jipata System###");
        System.out.println("Please,select option below: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Body Mess Index (BMT). ");
        System.out.println("2. Geometry capacity. ");
        System.out.println("3Working with Array.");
        System.out.println("Select:");
        System.out.println("Exit:");
        int Selector = sc.nextInt();

        switch (Selector) {
            case 1: bmi();break;

            case 2:

                System.out.println("Yes,Computer Programming.is very fun.");
                break;
            case 3:
                System.out.println(" ohhh,you might expert in Programming. ");
                break;
            default:
                System.out.println("You have to enter 1-3.");

        }

    }

    private static void showOption() {
        showOption();
    }

    private static void bmi() {
        //(BMT) = Weight/(Height*Height)
        Scanner in =new Scanner(System.in);

        System.out.print("Weight: ");
        float weight = in.nextFloat();

        System.out.print("Height: ");
        float height = in.nextFloat();

        float bmi = weight * 10000.00f / (height * height);
        System.out.println(bmi);

        in.close();

    }
}