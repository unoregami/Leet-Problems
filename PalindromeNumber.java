public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        int xLength = num.length();

        boolean res = false;
        int opposite = xLength - 1;
        for (int i = 0; i < xLength; i++) {
            if (num.charAt(i) == num.charAt(opposite)){
                res = true;
            } else {
                return false;
            }
            opposite--;
        }
        return res;
    }

    public static void main(String[] args) {
        int x = 1000021;
        boolean ret = new Solution().isPalindrome(x);
        
        System.out.println(ret);
    }
}
