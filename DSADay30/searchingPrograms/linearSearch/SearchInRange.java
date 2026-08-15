package DSADay30.searchingPrograms.linearSearch;
//Linear Search Problem 1: Search for 3 in the range of index [1,4]
public class SearchInRange {
    public static void main(String[] args) {
        int [] nums={18,12,-7,3,14,28};
        int target=3;
        System.out.println("index: "+linearSearch(nums, target, 1, 4));
    }
    public static int linearSearch(int [] arr,int target,int start,int end){
        if(arr.length==0)
            return -1;

        for (int i = start; i <=end; i++) {
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}
