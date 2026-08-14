package arrays;

import java.util.Scanner;

public class ArrayExample {
    //multi-Dimension Array
    //2-D Array
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Method 1: 
        // int [][] arr={
        //     {1,2,3},    //0th index
        //     {4,5,6},    //1st index
        //     {7,8,9}     //2nd index
        // };

        //Method 2:
        int [][] arr=new int[3][2];
        System.out.println(arr.length); //no. of rows

        //input:
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++) {
                arr[row][col]=sc.nextInt();
            }
        }
    }
}
