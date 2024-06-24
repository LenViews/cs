import java.util.Arrays;

public class SortArray {
    public void sortArray(int[] nums) {
        Arrays.sort(nums); // Using built-in sort method to sort the array
    }

    public static void main(String[] args) {
        SortArray solution = new SortArray();
        int[] nums = {0, 1, 0, 3, 12};
        solution.sortArray(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
