import java.util.Scanner;

public class Series1 {
    public static void main(String[]agrs){
        Scanner input=new Scanner (System.in);
        System.out.println("the series is 1^2+2^2+...+n^2");
        System.out.print("Enter the last number :");
        double last=input.nextDouble(),sum=0;
        for(int i=1;i<=last;i++){
            sum+=Math.pow(i, 2);
        }
        System.out.println("the Sum of the series ="+sum);
        input.close();
    }
}
