import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [] numbers={1,2,0,-3,5,-9};
        Arrays.sort(numbers);
        System.out.print("Ascending order:");
        for(int x: numbers){
            System.out.print(" "+x);
        }
        input.close();
    }
}
