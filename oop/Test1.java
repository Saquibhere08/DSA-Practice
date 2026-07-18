package oop;
// Test case for encapsulationExample1
public class Test1 {
    public static void main(String[] args) {
        EncapsualtionExample en=new EncapsualtionExample();
        System.out.println("Name: "+en.name);
        en.setAge(25);
        System.out.println("Age: "+en.getAge());
    }
}
