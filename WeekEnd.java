import java.util.Scanner;

public class WeekEnd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String [] Weekdays ={"Monday","Tuesday","Wednesday","Thuseday","Friday","Saturday","Sunday"};
        System.out.println("Enter day number(1-7): ");
        int day=input.nextInt();
        System.out.println("Your selected day is "+Weekdays[day-1]);
        input.close();
    }
}
