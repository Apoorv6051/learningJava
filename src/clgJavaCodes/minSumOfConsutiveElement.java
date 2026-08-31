package clgJavaCodes;

import java.util.Arrays;
import java.util.Collections;

public class minSumOfConsutiveElement {
    public static void main(String[] args) {

        int sum = 0;

        Integer[] arr = {1, 3, 4, 2};
        Integer[] nums = {1, 3, 4, 2};

        // Sorting arr in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.length - 1; i++) {
            sum += Math.abs(arr[i] - arr[i + 1]);
        }
        System.out.println(sum);

        // count swaps required to sort nums in ascending order
        int swapCount = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    swapCount++;
                }
            }
        }

        System.out.println("total swap =" + swapCount);
        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + " ");
        }
        System.out.println();
    }
}
