package MidtemExams;
import java.util.Scanner;
public class Exams2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;
        System.out.println("Enter: ");
        double r = sc.nextDouble();

        double Area = PI * r * r;
        System.out.println("Circle round: " + Area);

        double c = 2 * PI * r;
        System.out.println("Circle round: " + c);

        double v = (4 / 3) * r * r;
        System.out.println("Circle round: " + v);
    }
}
