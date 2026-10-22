import java.util.Scanner;

public class InputDEmo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter a integer value =");
        num=in.nextInt();
        System.out.println(num);
        in.close();
    }
}