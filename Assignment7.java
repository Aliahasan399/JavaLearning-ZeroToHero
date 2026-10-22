import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num,factorial=1;
        System.out.println("Enter a number for finding factorial :");
        num=input.nextInt();
        for(int i=1;i <= num;i++){
            factorial*=i;
        }
        System.out.println("the factorial of "+num+" is:"+factorial);
        input.close();
    }
}
