public class ProductArraySign {
    public static int signFunc(int x) {
        if (x > 0)
            return 1;
        else if (x < 0)
            return -1;
        return 0;
    }
    public int arraySign(int[] nums) {
        int sign = 1;
        for (int i = 0; i < (nums.length); i++) {
            if (i == 0) {
                sign = signFunc(nums[i]);
                continue;
            }
            sign *= signFunc(nums[i]);
        }
        return sign;
    }

    public static void main(String[] args) {
        int[] nums = {-1,1,-1,1,-1};

        System.out.println(new ProductArraySign().arraySign(nums));
    }
}
