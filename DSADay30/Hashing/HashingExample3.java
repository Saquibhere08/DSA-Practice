package Hashing;
public class HashingExample3 {
    public static void main(String[] args) {
        //Hashcode
        String name="Saquib";
        int code1=name.hashCode();
        //variableName.hashcode() - it will convert it into an number
        System.out.println(name);
        System.out.println(code1);

        Integer a=45677;
        int code2=a.hashCode();
        System.out.println(a);
        System.out.println(code2);
        //Note: Numbers cannot be converted into Numbers itself, so it will return the same value.
        
    }
}
