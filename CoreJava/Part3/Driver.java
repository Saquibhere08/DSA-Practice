
public class Driver {
    public static void main(String[] args) {
        SingletonClass s1=SingletonClass.getObject();
        SingletonClass s2=SingletonClass.getObject();

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        
    }
}
