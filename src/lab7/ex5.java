package lab7;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int totalEven = 0;
         int totalodd = 0;
         int x =0;
        for (int i = 0; i < 10; i++){

            System.out.print("Enter an integer: ");
             x = sc.nextInt();
            if(x %2 ==0)
                totalEven+= x; //total = total+x;
            else
                totalodd += x;


        }
        System.out.println("Total of even number:"+totalEven );
        System.out.println("Total of odd number:"+totalodd );




    }//main



}//c
