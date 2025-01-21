package leetcode_easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] returnSumIndices(int[] numbers, int sum){
        Map<Integer, Integer> valueIndexMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            valueIndexMap.put(numbers[i], i);
        }
        for (int i = 0; i < numbers.length; i++) {
            int addend = sum - numbers[i];
            if(valueIndexMap.containsKey(addend) && ( valueIndexMap.get(addend) != i)){
                return new int[] {i, valueIndexMap.get(addend)};
            }
        }
        return null;
    }
    public static void printArray(int[] numbers){
        if(numbers != null){
            for(int num: numbers){
                System.out.print(num + "  ");
            }
            System.out.println();
        }else{
            System.out.println("The array is null");
        }
    }

    public static void main(String[] args) {
        printArray(returnSumIndices(new int[] {1, 2, 3, 5, 6}, 6));
        printArray(returnSumIndices(new int[] {1, 2, 3, 2, -1}, 4));
        printArray(returnSumIndices(new int[] {1, 2, 3, 2, -1}, 1));
    }
}
