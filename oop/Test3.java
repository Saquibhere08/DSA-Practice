package oop;
//Test 2 case for AbstractionExample
public class Test3 extends AbstractionExample {
    @Override
    public void sayHello(){
        System.out.println("HAHAHAHHAA");
    }

    public static void main(String[] args) {
        Test3 t=new Test3();
        t.sayHello();
        t.sleep();
    }
}
