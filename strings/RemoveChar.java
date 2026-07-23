package strings;

public class RemoveChar {
    public static void main(String[] args) {
        String str="banana";
        char remove='a';
        String result="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=remove){  
                //we need to check if the target char is not there yet
                //because it is impossible to remove any char from an string, so we need to conside the remaining strings apart from the target char
                //which in result will automatically remove the target char
                result+=str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
