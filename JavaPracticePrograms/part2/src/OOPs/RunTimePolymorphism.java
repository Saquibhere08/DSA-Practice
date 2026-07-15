package OOPs;

class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Bhow Bhow");
    }
}

public class RunTimePolymorphism {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
    }
}