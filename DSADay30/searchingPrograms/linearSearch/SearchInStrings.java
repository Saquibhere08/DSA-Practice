package DSADay30.searchingPrograms.linearSearch;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name="Saquib";
        char target='u';
        //working of char.toArray()
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println("u is present on name? :"+search1(name, target));
        System.out.println("u is present on name? :"+search2(name, target));
    }
    static boolean search1(String str, char target){
        if(str.length()==0){
            return false;
        }
        //run for loop
        for (int i = 0; i < str.length(); i++) {
            if(target==str.charAt(i)){
                return true;
            }
        }

        return false;

    }
    static boolean search2(String str, char target){
        if(str.length()==0){
            return false;
        }
        //run for each loop
        for(char ch: str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        

        return false;

    }
}
