package CoreJava.Part1.Methods;

public class MthodsEx {
    
    public void playMusic(){    //method with no return type & no args - void
        System.out.println("Music Playingggg..");
    }

    public String getPen(int cost){ //method with return type & with args - String
        
        if(cost>=10)
            return "Pen";
        else
            return "nothing";
    }

    public int sqRoot(double n){    //pre-defined methods
        double result=Math.sqrt(n);
        return (int) result;
    }
    
    public static void main(String[] args) {
        MthodsEx ex=new MthodsEx();
        System.out.println(ex.getClass());  //provides the className of the particular class
        //method 1()
        ex.playMusic();
        //method 2()
        System.out.println(ex.getPen(2));

        //method 3() - predefined Methods
        System.out.println("Square Root: "+ex.sqRoot(360));

    }
}
