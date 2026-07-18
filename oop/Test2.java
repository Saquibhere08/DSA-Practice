package oop;
//Test 1 case for AbstractionExample
public class Test2 extends AbstractionExample {

    @Override
    public void sayHello(){
        System.out.println("HEHEHE");
    }
    public static void main(String[] args) {
        Test2 t=new Test2();
        t.sayHello();
        t.sleep();
    }

}
