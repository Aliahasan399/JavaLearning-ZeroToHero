import  java.util.Scanner;
public class PositiveNegtiveCheck {
    public  static void main(String[]args){
        Scanner input =new Scanner (System.in);
        System.out.printf("Enter a number = ");
        if(input.nextInt()>0){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is Negative");
        }
        input.close();
    }
}
