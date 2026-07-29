package Hashing;
/*
Count frequency of each element in the array
Problem Statement: Given an array, we have found the number 
of occurrences of each element in the array
*/
import java.util.HashMap;
import java.util.Map;
//optimal approach
public class CountElementsInAnArray {
    
    // Function to count frequency of each element in the array using HashMap
    public void Frequency(int[] arr, int n) {
        // Create a HashMap to store frequency of each element
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array and count frequencies
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Traverse through the HashMap and print frequencies
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // Input array
        int[] arr = {10, 5, 10, 15, 10, 5};
        int n = arr.length;

        // Create Solution instance
        CountElementsInAnArray sol = new CountElementsInAnArray();

        // Call the function to count frequencies
        sol.Frequency(arr, n);
    }
}
