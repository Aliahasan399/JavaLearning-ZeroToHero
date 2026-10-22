import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a latter: ");
        char  ch=input.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.printf("Capital LAtter");
        }
        else if(ch>='a' && ch<='z'){
            System.out.printf("Small LAtter");
        }
        else{
            System.out.println("it's not a latter");
        }
        input.close();
    }
}
