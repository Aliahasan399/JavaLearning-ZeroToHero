
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Have you completed your masters? ");
        char Ans1 = input.next().charAt(0);

        System.out.print("Are you fluent in English? ");
        char Ans2 = input.next().charAt(0);

        if ((Ans1 == 'y' || Ans1 == 'Y') &&
            (Ans2 == 'y' || Ans2 == 'Y')) {

            System.out.println("You are eligible for the interview");

        } else if (
            (Ans1 == 'y' || Ans1 == 'Y' || Ans1 == 'n' || Ans1 == 'N') &&
            (Ans2 == 'y' || Ans2 == 'Y' || Ans2 == 'n' || Ans2 == 'N')) {

            System.out.println("You are not eligible for the interview");

        } else {
            System.out.println("Enter Yes or No");
        }

        input.close();
    }
}
