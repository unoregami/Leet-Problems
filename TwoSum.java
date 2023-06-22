import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[0];
        for (int i = 0; i < nums.length; i++){
            for (int j = (i+1); j < nums.length; j++){
                if (nums[i] + nums[j] == target) {
                    index = new int[index.length + 2];
                    index[index.length - 2] = i;
                    index[index.length - 1] = j;
                }
            }
        }
        return index;
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 7, 11 ,15};
        int target = 9;

        int[] ret = new TwoSum().twoSum(nums, target);

        System.out.println(Arrays.toString(ret));
    }
}