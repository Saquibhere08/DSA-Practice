package CoreJava.Part2;

public class SingletonClass {
    private static SingletonClass s;

    private SingletonClass(){
        System.out.println("Object Created.");
    }

    public static SingletonClass getObject(){
        if(s==null){
            s=new SingletonClass();
        }
        return s;
    }

}


