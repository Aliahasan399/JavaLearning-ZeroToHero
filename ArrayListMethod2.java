import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethod2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList <Integer> numbers =new ArrayList<>();
        System.out.println(numbers.size());
        System.out.println("Is our arraylist Empty? "+numbers.isEmpty());
        numbers.add(0, 23);
        numbers.add(1, 3);
        numbers.add(2, -3);
        numbers.add(3, 24);
        numbers.add(4, 0);
        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println("Is our arraylist Empty? "+numbers.isEmpty());
        numbers.remove(0);
        numbers.removeAll(numbers);
        System.out.println(numbers);
        numbers.add(0, 23);
        numbers.add(1, 3);
        numbers.add(2, -3);
        numbers.add(3, 24);
        numbers.add(4, 0);
        numbers.clear();
        input.close();
    }
}
