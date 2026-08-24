package DSADay30.searchingPrograms.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

//OrderAgnostic Binary Search
public class BinarySearchExample2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = { -18,-12,-4,0,2,4,9,10,12,14,18,19,36};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.print("Enter Target element: ");
        int target=sc.nextInt();
        int result = search(arr,target);
        System.out.println("Index: " + result);
    }
    static int search(int []arr,int target){
        int start=0;
        int  end=arr.length-1;
        //find wheather the array is sorted in ascending or descending 
        boolean isAsc=arr[start]<arr[end];
        
        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;

                }else if(target>arr[mid]){
                    start=mid+1;

                }
                else{
                    if(target>arr[mid]){
                        end=mid-1;
                    }else{
                        start=mid+1;
                    }
                }
            }
        }
        return -1;
    }
}
