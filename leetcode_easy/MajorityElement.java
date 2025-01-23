package leetcode_easy;

public class MajorityElement {

    // Boyer Moore Algorithm
    public static int getMajorityElement(int[] array){
        int count = 0, element = array[0];
        for (int j : array) {
            if (count == 0) {
                element = j;
            }
            count += element == j ? 1 : -1;
        }
        return element;
    }
    public static void main(String[] args) {
        System.out.println(getMajorityElement(new int[] {0, 0, 0, 0, 1, 1}));
        System.out.println(getMajorityElement(new int[] {0, 1, 1, 3, 1, 1, 3, 3, 3, 3}));
        System.out.println(getMajorityElement(new int[] {0, 2, 2, 2, 1, 1}));
    }
}
