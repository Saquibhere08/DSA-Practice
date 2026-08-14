package CoreJava.Part2;

// 100% abstractions
interface Animal {
    void sound();    
}

class Dog implements Animal{
    public void sound(){
        System.out.println("Barks");
    }
}

class Cat implements Animal{
    public void sound(){
        System.out.println("Mew");
    }
}
