package Object;

public class Teacher2 {
    public static void main(String[] args) {
        FirstObject person = new FirstObject();
        System.out.println("Teacher 1:");
        person.setInformation("Anisul Islam", "24", 187234343);
        person.printInformation();
        System.out.println("Teacher 2:");
        person.setInformation("Rakib Islam", "34", 1875764343);
        person.printInformation();

    }
}
