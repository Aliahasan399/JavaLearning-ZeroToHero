import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ArrayListMethod3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList <Integer> numbers =new ArrayList<>();
        numbers.add(0, 23);
        numbers.add(1, 3);
        numbers.add(2, -3);
        numbers.add(3, 24);
        numbers.add(4, 0);
        System.out.println(numbers.size());
        System.out.println(numbers);
        //A value search from Arraylist
        System.out.println(numbers.contains(23));
        //A value index findout from Arraylist
        System.out.println(numbers.indexOf(0));
        //A value set/replace from specific  index in arraylist
        numbers.set(4, -1);
        System.out.println(numbers);
        //a Arraylist sort
        //1.Ascending order
        Collections.sort(numbers);
        System.out.println(numbers);
        //2.Descending order
        Collections.sort(numbers,Collections.reverseOrder());
        input.close();
    }
}
