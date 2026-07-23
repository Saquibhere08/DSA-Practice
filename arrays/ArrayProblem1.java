package arrays;

public class ArrayProblem1 {
    public static void main(String[] args) {
        int [] arr={1,2,5,7,8};
        int target=9;
        int j= arr[arr.length-1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]+j==target){
                System.out.println(arr[i]+" + "+j+" = "+ target);
                System.out.print("Elements of the array: ");
                System.out.println(arr[i]+","+j);
            }
            j--;
        }
    }
}
