import java.util.Scanner;
public class p1{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1,num2,num3;
        String  age;
        System.out.println("Enter Three Value=");
        num1=input.nextInt();
        num2=input.nextInt();
        num3=input.nextInt();
        System.out.println("Enter your age");
        age=input.next();
        if(num1>num2 && num1> num3){
            if(num2>num3){
                System.out.println(num1+">"+num2+">"+num3);
            }
            else{
                System.out.println(num1+"> " +num3 +"> "+num2);
            }
        }
        else if(num2>num1 && num2>num3){
            if(num1>num3){
                System.out.println(num2+">"+num1+">"+num3);
            }
            else{
                System.out.println(num2+"> " + num3 +"> "+num1);
            }
        }
        else{
            if(num1>num2){
                System.out.println(num3+">"+num1+">"+num2);
            }
            else{
                System.out.println(num3+"> " + num2 +"> "+num1);
            }
        }
        System.out.println("You age " + age);
        input.close();
    }
}