import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Which Language you use Browser?\nif you choose Bangali type 1\nif you choose Hindi type 2\nif you choose Urdo type 3\nEnglish is default language\n");

        switch(input.nextInt()){
            case 1:System.out.println("you selected Bengali Language");
            break;
            case 2:System.out.println("you selected Hindi Language");
            break;
            case 3:System.out.println("you selected Urdu Language");
            break;
            default:System.out.println("you selected English Language");
        }
        input.close();
    }
}
