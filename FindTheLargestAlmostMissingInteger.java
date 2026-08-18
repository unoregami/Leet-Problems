import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class Sample {
    public static int largestInteger(int[] nums, int k) {
        ArrayList<int[]> arrays = new ArrayList<int[]>();
        HashMap<Integer, Integer> num_count = new HashMap<Integer, Integer>();

        for (int i = 0; i <= nums.length-k; i++) {
            arrays.add(Arrays.copyOfRange(nums, i, i+k)); 

        }
        int num_count_value = 0;
        ArrayList<Integer> unique = new ArrayList<Integer>();
        for (int[] i : arrays) {
            for (int j : i) {
                if (!num_count.containsKey(j)) {
                    num_count.put(j, 1);
                } else if (!unique.contains(j)) {
                    num_count_value = num_count.get(j);
                    num_count.replace(j, ++num_count_value);
                }
                unique.add(j);
            }
            unique.clear();
        }
        int largest_almost_missing = -1;
        for (int i : num_count.keySet()) {
            if (num_count.get(i) == 1 && largest_almost_missing < i) {
                largest_almost_missing = i;
            }
        }

        return largest_almost_missing;
    }
    public static void main(String[] args) {
        int[] nums = {3,9,2,1,7};
        int k = 3;
        int output = largestInteger(nums, k);

        System.out.print("nums: ");
        for (int i : nums) {
            System.out.print(i + " ");
        }

        System.out.println("\nk: " + k);
        System.out.println("\nOutput: " + output);
    }
}