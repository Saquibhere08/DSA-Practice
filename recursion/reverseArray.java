//Problem 6. You are given an array. The task is to reverse the array and print it.
package recursion;
import java.util.Arrays;
public class reverseArray{
    public static void main(String [] args){
        int []a={1,2,3,4,5};
        int i=0;
        int j=a.length-1;
        System.out.println("Original Array: "+ Arrays.toString(a));
        revArray(a,i,j);
    }

    public static void revArray(int [] a,int i,int j){
        if(i>=j){
            System.out.println("Reversed Array: "+ Arrays.toString(a));
            return;
        }
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        revArray(a,++i,--j);
        }  
}