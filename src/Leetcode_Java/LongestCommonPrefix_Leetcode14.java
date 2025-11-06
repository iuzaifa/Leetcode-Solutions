package Leetcode_Java;

import java.util.Arrays;

public class LongestCommonPrefix_Leetcode14 {
    public static void main(String[] args) {
        String [] array  = {"flower","flow","flight"};

        System.out.println(longestCommonPrefix(args));




    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();

        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        for (int i = 0; i < first.length-1; i++){
            if (first[i] != last[i]) break;
            prefix.append(first[i]);
        }

        return prefix.toString();

    }
}
