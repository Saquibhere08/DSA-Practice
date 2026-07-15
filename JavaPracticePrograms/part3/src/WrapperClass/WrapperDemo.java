package WrapperClass;

public class WrapperDemo {

    public static void main(String[] args) {

        // Autoboxing
        Integer obj = 100;

        // Unboxing
        int num = obj;

        System.out.println(obj);
        System.out.println(num);

        String str = "500";

        int value = Integer.parseInt(str);

        System.out.println(value);
    }
}
