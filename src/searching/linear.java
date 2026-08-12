package searching;

public class linear {
    public static void main(String[] args) {
        int[] nums={ 45,28,86,90,98,45,67,};
        int target = 90;
        int ans = linearSearch(nums,target);
        System.out.println(ans);


    }

    // search in the array : return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;

        }
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it = target
            int element = arr[index];
             if (element == target) {
                return index;
            }
        }
        //this line will execute if none of the return statement above have executed
        // hence the target is not found
        return Integer.MAX_VALUE;
    }
}




