public class test {
    public static void main(String[] args) {
        String[] strs = {"mort", "ryot", "tory", "troy", "tyro"};

        
        for (int i = 0; i < (strs.length - 1); i++) { //i == words in array
            for (int j = 0; j < (strs[i].length() - 1); j++){ //j == 1st char place in words
                for (int k = (j+1); k < strs[i].length(); k++) {    //k == 2nd char place 
                    char a, b;
                    String wordX;
                    char[] chars = strs[i].toCharArray();
                    a = strs[i].charAt(j);
                    b = strs[i].charAt(k);

                    chars[j] = b;
                    chars[k] = a;
                    wordX = String.valueOf(chars);
                    System.out.print("Original word: " + strs[i]);
                    System.out.println("\t" + wordX);
                }
            }
        }
    }
}
