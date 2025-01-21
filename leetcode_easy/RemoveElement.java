package leetcode_easy;

public class RemoveElement {
    public static int removeElement(int[] numbers, int value){
        int i = 0;
        for (int num: numbers){
            if(num != value){
                numbers[i] = num;
                i++;
            }
        }
        return i;
    }
    public static void printArray(int[] numbers, int finalIndex){
        for (int i = 0; i < finalIndex; i++) {
            System.out.print(numbers[i] + "  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 1, 5, 5, -1, 0, 11};
        printArray(numbers, removeElement(numbers, 5));
        printArray(numbers, removeElement(numbers, 1));
    }
}
