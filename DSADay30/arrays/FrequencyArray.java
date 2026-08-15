package DSADay30.arrays;

public class FrequencyArray {
    public static void main(String[] args) {
        int  [] arr={1,2,3,3,2,1,0,0};

        boolean [] visited=new boolean[arr.length];
        //to avoid duplicates we take a boolean [] set the  length same as that of array length.
        for(int i=0;i<arr.length;i++){

            if(visited[i])  //if the element is visited, than continue moving forward
                continue;

            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;    //set the value as true, so that it provides unique values each time.
                }
                
            }
            System.out.println(arr[i]+" = "+count);
            
        }
    }
}
