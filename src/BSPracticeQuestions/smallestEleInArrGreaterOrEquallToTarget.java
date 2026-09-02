package BSPracticeQuestions;

public class smallestEleInArrGreaterOrEquallToTarget {
    public static void main(String[] args) {
        // CEILING NUMBER = SMALLEST ELEMENT IN ARRAY GREATER OR = TARGET
        int[] arr = {1,2,3,4,5};
        int target =6;
        int ans= celingOfNumber(arr,target);
        System.out.println(arr[ans]);





    }
    static int  celingOfNumber(int[] arr, int target){
        if(target > arr[arr.length-1 ]){
            return -1;
        }
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid =start + (end - start) / 2;
//            if(arr[mid]== target){
//                return mid;
//
//            }
            if(target<arr[mid]) {
                end = mid - 1;

            }
            else if(target>arr[mid]){
                start= mid+1;



            }else{
                return mid;
            }

        }
        return start;

    }
}
