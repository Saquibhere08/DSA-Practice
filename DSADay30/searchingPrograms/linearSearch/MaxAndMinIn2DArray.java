package DSADay30.searchingPrograms.linearSearch;


//Problem: Find Maximum and Minimum Element in 2D array
class MaxiAndMinIn2DArray {
    public static void main(String[] args) {
         int [][]arr={
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12}
        };
        System.out.println("Maximum Value: "+max(arr));
        System.out.println("Minimum Value: "+min(arr));
    }

    public static int max(int[][]arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }

    public static int min(int[][] arr){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        return min;
    }
}
