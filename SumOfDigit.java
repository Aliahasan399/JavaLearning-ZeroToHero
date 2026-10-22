import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input=new  Scanner(System.in);
        System.out.print("Enter a Number: ");
        int sum=0,digit,number=input.nextInt();
        int Cnumber=number;
        while(Cnumber!=0){
            digit=Cnumber%10;
            sum+=digit;
            Cnumber=Cnumber/10;
        }
        System.out.println("The sum of the Digits of number="+sum);
        input.close();
    }
}
