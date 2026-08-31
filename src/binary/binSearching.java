package binary;

public class binSearching {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 36;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }

    // return index of target, or -1 if not found
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // (start + end) / 2 can overflow for large ints
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                // ans found

                end = mid - 1;
                return mid;
            }
        }
        return -1;
    }
}
