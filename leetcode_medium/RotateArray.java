package leetcode_medium;

public class RotateArray {
    public static void rotate(int[] numbers, int k){
        k = k % numbers.length;
        reverse(numbers, 0, numbers.length - 1);
        reverse(numbers, 0, k-1);
        reverse(numbers, k, numbers.length - 1);
    }
    public static void reverse(int[] numbers, int left, int right){
        while(left < right){
            int temp = numbers[left];
            numbers[left++] = numbers[right];
            numbers[right--] = temp;
        }
    }
    public static void printArray(int[] numbers){
        for(int num: numbers){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers1 = {-1,-100,3,99};
        int[] numbers2 = {1,2,3,4,5,6,7};
        rotate(numbers1, 2);
        rotate(numbers2, 3);
        printArray(numbers1);
        printArray(numbers2);
    }
}
