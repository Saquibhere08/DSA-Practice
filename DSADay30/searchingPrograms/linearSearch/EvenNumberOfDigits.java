package DSADay30.searchingPrograms.linearSearch;

import java.util.Arrays;

//LeetCode Problem 1295:Find the Even Number of Digits.
public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = { 12, 345, 2, 6, 7896 };
        System.out.println(Arrays.toString(arr));
        int result = findNumbers(arr);
        System.out.println(result);

    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (even(i)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int nums) {
        int numberOfDigits = digits(nums);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int nums) {
        int count = 0;

        while (nums > 0) {
            count++;
            nums = nums / 10;
        }
        return count;
    }
}
