package CoreJava.Part2;
//Mutiple Inheritance using Interface
interface A{
    void light();
}

interface B{
    void fan();
}

public class C implements A,B{
    public void light(){
        System.out.println("Light:ON");
    }

    public void fan(){
        System.out.println("Fan:OFF");
    }
}

