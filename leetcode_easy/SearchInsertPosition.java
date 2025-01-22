package leetcode_easy;

public class SearchInsertPosition {
    public static int insertPosition(int[] numbers, int value){
        int start = 0, end = numbers.length - 1;
        if(value>numbers[end]) return end + 1;
        while(start<end){
            final int mid = (start + end) / 2;

            if(numbers[mid] == value) return mid;

            if(numbers[mid] > value){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        System.out.println(insertPosition(new int[]{1, 2, 4, 5, 10}, 2));
        System.out.println(insertPosition(new int[]{1, 2, 4, 5, 10}, 3));
        System.out.println(insertPosition(new int[]{1, 2, 4, 5, 10}, 11));
    }
}
