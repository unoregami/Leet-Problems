//Replace char-by-char and compare if equals to another word on array

import java.util.Scanner;

public class SimilarStringGroups {
    public int numSimilarGroups(String[] strs) {
        int output = 0; //similar string group counter

        for (int i = 0; i < (strs.length - 1); i++) { //i == words in array
            for (int j = 0; j < (strs[i].length() - 1); j++){ //j == 1st char place in words
                for (int k = (j+1); k < strs[i].length(); k++) {    //k == 2nd char place 
                    String wordX = switchWord(strs[i], j, k);
                    System.out.println("wordX: " + wordX + "\tstrs[i+1]: " + strs[i+1]);

                    if (wordX.equals(strs[(i+1)])) {
                        System.out.println(strs[i] + "\t[" + j + ", " + k + "]\t" + strs[i+1]);
                        output++;
                    }

                    wordX = switchWord(wordX, j, k);
                    System.out.println("wordX: " + wordX + "\tstrs[i+1]: " + strs[i+1]);

                    if (wordX.equals(strs[(i+1)])) {
                        System.out.println(strs[i] + "\t[" + j + ", " + k + "]\t" + strs[i+1]);
                        output++;
                    }
                }
            }
        }
        return output;
    }

    public String switchWord(String wordX, int j, int k) {
        //turns string to an array of characters
        char[] chars = wordX.toCharArray();
        char a, b;      //placeholder for the word to be compared
        a = wordX.charAt(j);
        b = wordX.charAt(k);

        //switcharoo the chars
        chars[j] = b;
        chars[k] = a;
        wordX = String.valueOf(chars);
        return wordX;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        test1 obj = new test1();
        
        System.out.print("Array length: ");
        int a = console.nextInt();
        String[] words = new String[a];

        for (int i = 0; i < words.length; i++) {
            System.out.print("Input word: ");
            words[i] = console.next();
        }
        System.out.println();

        System.out.println("Output: " + obj.numSimilarGroups(words));
    }
}
