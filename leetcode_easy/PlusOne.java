package leetcode_easy;

public class PlusOne {
    public static int[] plusOne(int[] digits){
        for (int i = digits.length - 1; i >= 0 ; i--) {
            if(digits[i] + 1 != 10){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] digits1 = new int[digits.length + 1];
        digits1[0] = 1;
        return digits1;
    }
    public static void printArray(int[] array){
        for (int num : array){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printArray(plusOne(new int[]{1, 2, 3, 4, 5}));
        printArray(plusOne(new int[]{1, 0, 0, 0}));
        printArray(plusOne(new int[]{9, 9, 9}));
        printArray(plusOne(new int[]{9, 9}));
    }
}
