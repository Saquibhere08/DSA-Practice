package DSADay30.day1;

public class SwapNumbers {
    public static void main(String[] args) {
        int n=12;
        int m=21;
        System.out.println("n: "+n);
        System.out.println("m: "+m);
        Swap1(n, m);
        Swap2(n, m);
    }
    public static void Swap1(int n, int m){
        //using third var 'temp'
        System.out.println("case 1");
        int temp=n;
        n=m;
        m=temp;
        System.out.println("n: "+n);
        System.out.println("m: "+m);
    }

    public static void Swap2(int n,int m){
        System.out.println("case 2");
        n=n+21-n;
        m=m-n+12;
        System.out.println("n: "+n);
        System.out.println("m: "+m);
    }
}
