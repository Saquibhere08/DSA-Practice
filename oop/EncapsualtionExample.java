package oop;

public class EncapsualtionExample {    
    String name="Saquib";
    private int age;

    //setter()
    public void setAge(int age){
        if(age <0){
            age=0;
        }
        this.age=age;
    }
    //getter()
    public int getAge(){
        return this.age;
    }
    
}
