package Object;

public class Teacher3 {
    public static void main(String[] args) {
        FirstObject person1 = new FirstObject("Anisul Islam", "24", 187234343);
        System.out.println("Teacher 1:");
        person1.printInformation();
        FirstObject person2 = new FirstObject("Rakib Islam", "34", 1875764343);
        System.out.println("Teacher 2:");
        person2.printInformation();
    }
}
