package strings;

public class StringExamples {
    public static void main(String[] args) {
        strExample1();
    }

    public static void strExample1(){
        // string are immutable, where as stringbuffer and stringbuilders are mutable
        String s1="Hello";
        
        String s2=new String("Hello");

        StringBuffer s3= new StringBuffer("Hello");
        StringBuffer s4 = new StringBuffer("Hello");
        StringBuilder s5= new StringBuilder("Hello");
        StringBuilder s6 =new StringBuilder("Hello");

        //strings
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        //stringbuffer
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

        //stringbuilder
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s5==s6);
        System.out.println(s5.equals(s6));

    }
}
