import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListMethod {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        ArrayList <Integer> numbers= new ArrayList<>();
        numbers.add(20);
        numbers.add(0);
        numbers.add(-3);
        numbers.add(34);
        numbers.add(29);
        //All  arraylist print method
        //1.With Iterator
        Iterator num=numbers.iterator();
        while (num.hasNext()) {
            System.out.print(num.next()+" ");
        }
        //2.Sout
        System.out.println();
        System.out.println(numbers);
        //3.For each loop
        for(int x : numbers){
            System.out.print(x+" ");
        }
        input.close(); 
    }
}
