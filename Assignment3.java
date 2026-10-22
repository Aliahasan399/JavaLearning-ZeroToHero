import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);        
        System.out.print("Do you love Java: ");
        char ch=input.next().charAt(0);
        if(ch=='y'|| ch=='Y'){
            System.out.println("You are a java lover");
        }
        else if(ch=='n'|| ch=='N'){
            System.out.println("You are a not java lover");
        }
        else{
            System.out.println("Enter Yes or No");
        }
        input.close();
    }
}
