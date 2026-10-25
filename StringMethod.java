public class StringMethod {
    public static void main(String[] args) {
        String s1="Ali Ahasan";
        String s2=new String("Ali Ahasan");
        System.out.println(s1.length());
        System.out.println(s1.equals(s2));
        System.out.println(s1.contains(s2));
        System.out.println(s1.contains("Ah"));
        System.out.println(s1.contains("Robi"));
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s1.concat(s2));
        System.out.println(s1.startsWith("Ali"));
        System.out.println(s1.endsWith("an"));
    }
}
