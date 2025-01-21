package leetcode_easy;

public class RemoveDuplicates {
    public static int removeDuplicateEntries(int[] numbers){
        int count = 0;
        for (int i = 0; i <numbers.length; i++) {
            if(numbers[count] != numbers[i]){
                numbers[++count] = numbers[i];
            }
        }
        return ++count;
    }
    public static void printArray(int[] numbers, int k){
        for (int i = 0; i < k; i++) {
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 1, 1, 2, 3, 4, 4};
        int[] nums1 = new int[] {0, 0, 1, 1, 1, 2, 2};
        printArray(nums, removeDuplicateEntries(nums));
        printArray(nums1, removeDuplicateEntries(nums1));
    }
}
