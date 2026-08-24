



public class ObjectClass implements Cloneable {   //we don't need to extend it, it automatically gets 

    public int age=25;
    public String s="java";

    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectClass ob=new ObjectClass();

        System.out.println(ob.getClass());
        System.out.println(ob.hashCode());

        ObjectClass ob1=new ObjectClass();
        ObjectClass ob2=new ObjectClass();

        ObjectClass ob3=(ObjectClass)ob.clone();
        System.out.println(ob3.age);

        System.out.println(ob1.equals(ob2));

        System.out.println(ob.toString());

    }
}
