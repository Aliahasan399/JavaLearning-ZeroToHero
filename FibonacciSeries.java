import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0,position,FN=0,SN=1;
        System.out.print("How many number do you see :");
        position=input.nextInt();
        if (position == 1) {
            System.out.println("Fibonacci number: " + FN);
        } else if (position == 2) {
            System.out.println("Fibonacci number: " + SN);
        }
        else {
        for(int i=3;i<=position;i++){
            sum=FN+SN;
            FN=SN;
            SN=sum;
        }
        System.out.println("The number is  : "+sum);
        }
        input.close();
    }
}
