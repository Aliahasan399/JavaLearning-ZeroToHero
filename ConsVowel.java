import java.util.Scanner;

public class ConsVowel {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char ch=input.next().charAt(0);
        if(ch=='A' || ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' ||ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' || ch=='u')
            System.out.println("the character is vowel");
        else if((ch!='A' || ch!='E' ||ch!='I' ||ch!='O' ||ch!='U' ||ch!='a' ||ch!='e' ||ch!='i' ||ch!='o' || ch!='u') && (ch>='A'&&ch<='Z' || ch>='a' && ch<='z')){
            System.out.println("The character is consonant");
        }
        else{
            System.out.println("It's not  a character");
        }
        input.close();
    }
}
