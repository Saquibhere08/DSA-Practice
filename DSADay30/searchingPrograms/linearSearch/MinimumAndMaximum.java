package DSADay30.searchingPrograms.linearSearch;
//Problem Statement 2: Find the minimum & maximum element present inside the array
public class MinimumAndMaximum {
    public static void main(String[] args) {
        int [] nums={18,12,-7,3,14,28};
        System.out.println("min: "+min(nums));
        System.out.println("max: "+max(nums));
    }
    //minimum element inside the array
    public static int min(int [] arr){
        int result=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<result){
                result=arr[i];
            }            
        }
        return result;
    }
    //maximum element inside the array
    public static int max(int [] arr){
        int result=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>result){
                result=arr[i];
            }            
        }
        return result;
    }


}
