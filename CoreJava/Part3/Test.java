package CoreJava.Part3;

public class Test {
    public static void main(String[] args) {
        Dog dog=new Dog();

        dog.sayHello();
        dog.setAge(23);
        dog.setName("Fluppy");
        
        //print the outputs:
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
    }
}
