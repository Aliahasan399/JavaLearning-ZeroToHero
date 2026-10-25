public class StringMethod2{
    public static void main(String[] args) {
        String s1="Bangladesh is beautiful Country";
        System.out.println(s1.charAt(2));
        System.out.println(s1.codePointAt(3));
        System.out.println(s1.indexOf("is"));
        System.out.println(s1.indexOf('b'));
        System.out.println(s1.replace("Bangladesh", "China"));
        String[] s2=s1.split(" ");
        for(String x:  s2){
            System.out.println(x);
        }
        s1=new String(" Bangladesh is beautiful Country ");
        System.out.println(s1.trim());

    }
}