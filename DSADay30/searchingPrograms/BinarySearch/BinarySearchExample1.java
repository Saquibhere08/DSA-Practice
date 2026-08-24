package DSADay30.searchingPrograms.BinarySearch;

import java.util.Arrays;

//Binary Search:
//problem:Find the maxmimum number of such comparisons in wrost case. 
public class BinarySearchExample1 {
    public static void main(String[] args) {
        int[] arr = { -18,-12,-4,0,2,4,9,10,12,14,18,19,36};
        System.out.println("Array: " + Arrays.toString(arr));
        int result = search(arr,8);
        System.out.println("Index: " + result);
    } 
    //return the index
    //return -1 if it does not exist
    static int search(int[] arr,int target) {
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            //find the middle element
            //int mid=(start+end)/2; //midght be possible that it exceeds the array range in java

            int mid=start+(end-start)/2; //better way to find mid
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    } 
}
