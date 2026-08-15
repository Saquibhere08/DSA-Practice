package DSADay30.searchingPrograms.linearSearch;
//Linear Search
public class SearchingExample2 {
     public static void main(String[] args) {
        int [] nums={23,45,1,2,8,19,-3,16,-11,28};
        int target=19;
        
        System.out.println("Is target element 19 present? :"+linearSearch(nums, target));
    }

    //search in the array: return the index if target is found
    //otherwise: if the target is not found than return -1
    public static boolean linearSearch(int [] arr, int target){
        if(arr.length==0){
            return false;
        }

        //run the loop
        for(int i=0;i<arr.length;i++){
            //check for element at every index if it is = target
            int element=arr[i];
            if(element==target){
                return true;
            }
        }
        //if the target is not found it will return -1
        return false;
    }
}

