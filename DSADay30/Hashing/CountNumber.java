package DSADay30.Hashing;
/*
Count frequency of each element in the array
Problem Statement: Given an array, we have found the number 
of occurrences of each element in the array
*/
public class CountNumber {
    public static void main(String[] args) {
        int []arr={10,5,10,15,10,5};
    //brute-force approach
        int []count=countFreq(arr);

        //print the frequency
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+": "+count[i]);
        } 


    }
    //brute-force approach
    public static int[] countFreq(int [] arr){
        int [] frequency=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    
                }
            }
            frequency[i]=count;
        }
        return frequency;
        
    }
    

}
