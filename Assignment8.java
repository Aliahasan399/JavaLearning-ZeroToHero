import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please first Sign up in our System");
        System.out.print("Enter Username: ");
        String username=input.nextLine();
        System.out.println("Enter password: ");
        String password=input.nextLine();
        while(true){
            System.out.println("Please Sign in then use our service");
            System.out.print("Enter Username: ");
            String username1=input.nextLine();
            System.out.println("Enter password: ");
            String password2=input.nextLine();
            if(username.equals(username1) && password.equals(password2)){
                System.out.println("Welcome in our syetem");
                break;
            }
            else{
                System.out.println("your username and password are incorrect.please try again");
                System.out.println("If you can try to exit from System type 0 & not exit type 1");
                int ex=input.nextInt();
                input.nextLine();
                if (ex == 0) {
                    System.out.println("You have exited the system.");
                    break;
                } else if (ex == 1) {
                    continue;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            }
        }
        input.close();
    }
}
