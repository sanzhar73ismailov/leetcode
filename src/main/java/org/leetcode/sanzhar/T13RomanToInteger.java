package org.leetcode.sanzhar;

import java.util.Map;

public class T13RomanToInteger {
    /*
    Symbol       Value
I             1    -
V             5
X             10   -
L             50
C             100  -
D             500
M             1000  -

1 - I    11 - XI    21 - XXI
2 - II   12 - XII   22 - XXII
3 - III  13 - XIII  23 - XXIII
4 - IV   14 - XIV   24 - XXIV
5 - V    15 - XV    25 - XXV
6 - VI   16 - XVI   26 - XXVI
7 - VII  17 - XVII  27 - XXVII
8 - VIII 18 - XVIII 28 - XXVIII
9 - IX   19 - XIX   29 - XXIX
10 - X   20 - XX    30 - XXX
     */
    public int romanToInt(String s) {
        int n = s.length();
        Map<Character, Integer> mapOnes = Map.of(
                'I', 1,
                'X', 10,
                'C', 100,
                'M', 1000,
                'V', 5,
                'L', 50,
                'D', 500
        );
        int sum = 0;
        int i = 0;
        while (i < n) {
            int value = mapOnes.get(s.charAt(i));
            if (value % 10 == 0 || value == 1) {
                boolean isNextMore = false;
                int nextVal = 0;
                if (i < n - 1) {
                    nextVal = mapOnes.get(s.charAt(i + 1));
                    isNextMore = nextVal > value;
                }
                if (isNextMore) {
                    sum = sum  + nextVal - value;
                    i++;
                } else {
                    sum += value;
                }
            } else {
                sum += value;
            }
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        //int res = new T13RomanToInteger().romanToInt("I");
        romanToIntTest("I");
        romanToIntTest("II");
        romanToIntTest("III");
        romanToIntTest("IV");
        romanToIntTest("V");
        romanToIntTest("VI");
        romanToIntTest("VII");
        romanToIntTest("VIII");
        romanToIntTest("IX");
        romanToIntTest("XI");
        romanToIntTest("XII");
        romanToIntTest("XIII");
        romanToIntTest("XIV");
        romanToIntTest("XV");
        romanToIntTest("XVI");
        romanToIntTest("XVII");
        romanToIntTest("XVIII");
        romanToIntTest("XIX");
        romanToIntTest("XX");
    }

    public static void romanToIntTest(String arg) {
        int res = new T13RomanToInteger().romanToInt(arg);
        System.out.println(arg + " = " + res);
    }

}
