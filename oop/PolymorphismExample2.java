package oop;
//run-time polymorphism example
public class PolymorphismExample2 extends AbstractionExample {
    //method overriding
    @Override
    public void sayHello(){
        System.out.println("Hey, This is the HR of that Shitty Company");
    }
    public static void main(String[] args) {
        PolymorphismExample2 p=new PolymorphismExample2();
        p.sayHello();
        p.sleep();
    }
}
