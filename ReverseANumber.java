import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a Integer number: ");
        int ReverseNumber=0,digit,number=input.nextInt();
        int Cnumber=number;
        while(Cnumber!=0){
            digit=Cnumber%10;
            ReverseNumber=ReverseNumber*10+digit;
            Cnumber=Cnumber/10;
        }
        System.out.println("The Reverse number is ="+ReverseNumber);
        input.close();
    }
}
