import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  num;
        System.out.print("Enter a positive interger for Time Table :");
        num=input.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" * "+i+"= "+i*num);
        }
        input.close();
    }
}
