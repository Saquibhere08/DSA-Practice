package CoreJava.Part3;

public class Dog extends Animal {
    
    //method overriding
    @Override
    public void sayHello() {
        System.out.println("Woof!");
    }

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
