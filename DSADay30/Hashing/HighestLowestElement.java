package DSADay30.Hashing;

import java.util.Arrays;

public class HighestLowestElement {
    public static void main(String[] args) {
        int []arr={1,20,700,56,900,23,66,43};
        int ans1=highestElement(arr);
        int ans2=lowestElement(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Highest Element: "+ans1);
        System.out.println("Lowest Element: "+ans2);
    }
    public static int highestElement(int [] arr){
        int high=arr[0];
        for(int i=0;i<arr.length;i++){
            for (int j = 0; j < arr.length; j++) {
                if(high>arr[j]){
                    high=arr[j];
                }
            }
        }
        return high;
    }

    public static int lowestElement(int[] arr){
        int low=arr[0];
        for(int i=0;i<arr.length;i++){
            for (int j = 0; j < arr.length; j++) {
                if(low<arr[j]){
                    low=arr[j];
                }
            }
        }
        return low;
    }
}

