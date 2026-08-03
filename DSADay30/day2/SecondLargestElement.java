package DSADay30.day2;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
       
        int largest=0;
        int secondLargest=0;
        int [] arr={1,2,33,4,5,66,334}; //array
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    largest=arr[i];
                    secondLargest=arr[j];
                }
            }
        }
        System.out.println("array: "+Arrays.toString(arr));
        System.out.println("Largest Element: "+largest);
        System.out.println("Second Largest Element: "+secondLargest);
    }
}
