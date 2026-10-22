import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner inputnew  = new Scanner  (System.in);
        System.out.print("Enter a Base = ");
        double base =inputnew.nextDouble();
        System.out.print("Enter a Height = ");
        double Height =inputnew.nextDouble();
        System.out.println("The Area of Triangle = " +((1/2.0)*Height*base));
        inputnew.close();
    }
}
