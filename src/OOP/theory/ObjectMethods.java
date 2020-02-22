package OOP.theory;

public class ObjectMethods {
    public static void main(String[] args) {
        Object o = new Object();
        o = "sdf";
        System.out.println(o);
        System.out.println(o.getClass());
        System.out.println(o.hashCode());

        o = 15;
        System.out.println(o);
        System.out.println(o.getClass());

        o = "JAVA";
        System.out.println(o.toString());
    }
}
