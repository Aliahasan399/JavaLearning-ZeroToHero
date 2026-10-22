import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        final double PI=3.1415;
        Scanner  Input=  new Scanner(System.in);
        System.out.printf("Enter radius of a Circle =");
        double radius =Input.nextDouble();
        System.out.println("The area of a circle = "+(PI*radius*radius));
        Input.close();
    }
}
