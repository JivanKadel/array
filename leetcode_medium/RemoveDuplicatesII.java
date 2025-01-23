package leetcode_medium;

public class RemoveDuplicatesII {
    public static int countElements(int[] numbers){
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(count < 2 || numbers[i] > numbers[count-2]){
                numbers[count] = numbers[i];
                count++;
            }
        }
        return count;
    }
    public static void printArray(int[] nums, int k){
        for(int i = 0; i < k; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers1 = new int[]{0, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5};
        printArray(numbers1, countElements(numbers1));
        int[] numbers2 = new int[]{0, 0, 0, 1, 1, 2, 3, 3, 3};
        printArray(numbers2, countElements(numbers2));
    }
}
