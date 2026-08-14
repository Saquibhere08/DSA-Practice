package oop;
//compile-time polytmorphism example - because the methods are overloaded at compile time only
public class PolymorphismExample1 {
    
    //method overloading - same name but it will differ by length or signature
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b,int c){
        return a+b+c;
    }

    public double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        PolymorphismExample1 p=new PolymorphismExample1();
        System.out.println(p.add(10, 20));
        System.out.println(p.add(16, 36, 42));
        System.out.println(p.add(45000, 36000));
    }
}
