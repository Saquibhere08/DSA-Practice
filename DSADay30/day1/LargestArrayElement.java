package DSADay30.day1;
//DSA Problem - Find the largest Number in an Array
public class LargestArrayElement {
    public static void main(String[] args) {
        int [] arr={1,2,5,7,9,99,66,5,100,65,88,999};

        int target=arr[arr.length-1];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>target){
                target=arr[i];
            }
        }
        System.out.println("LArgest Element: "+target);
    }
}
