package org.leetcode.sanzhar;

public class T03LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int longest = s.length() > 0 ? 1 : 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String substr = ch + "";
            for (int j = i + 1; j < s.length(); j++) {
                char chNext = s.charAt(j);
                if (substr.contains(chNext + "")) {
                    break;
                } else {
                    substr = s.substring(i, j + 1);
                }
                int size = substr.length();
                if (size > longest) {
                    longest = size;
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {
//        int res = new T03LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcabcbb");
//        int res = new T03LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("bbbbb");
//        int res = new T03LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("pwwkew");
        int res = new T03LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("au");
        System.out.println("res = " + res);
    }
}
