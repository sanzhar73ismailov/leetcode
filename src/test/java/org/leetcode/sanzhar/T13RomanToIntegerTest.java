package org.leetcode.sanzhar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class T13RomanToIntegerTest {

    @Test
    void romanToInt() {
        T13RomanToInteger romanToInteger = new T13RomanToInteger();
        assertThat(romanToInteger.romanToInt("I")).isEqualTo(1);
        assertThat(romanToInteger.romanToInt("II")).isEqualTo(2);
        assertThat(romanToInteger.romanToInt("III")).isEqualTo(3);
        assertThat(romanToInteger.romanToInt("IV")).isEqualTo(4);
        assertThat(romanToInteger.romanToInt("V")).isEqualTo(5);
        assertThat(romanToInteger.romanToInt("VI")).isEqualTo(6);
        assertThat(romanToInteger.romanToInt("VII")).isEqualTo(7);
        assertThat(romanToInteger.romanToInt("VIII")).isEqualTo(8);
        assertThat(romanToInteger.romanToInt("IX")).isEqualTo(9);
        assertThat(romanToInteger.romanToInt("X")).isEqualTo(10);
        assertThat(romanToInteger.romanToInt("XI")).isEqualTo(11);
        assertThat(romanToInteger.romanToInt("XII")).isEqualTo(12);
        assertThat(romanToInteger.romanToInt("XIII")).isEqualTo(13);
        assertThat(romanToInteger.romanToInt("XIV")).isEqualTo(14);
        assertThat(romanToInteger.romanToInt("XV")).isEqualTo(15);
        assertThat(romanToInteger.romanToInt("XVI")).isEqualTo(16);
        assertThat(romanToInteger.romanToInt("XVII")).isEqualTo(17);
        assertThat(romanToInteger.romanToInt("XVIII")).isEqualTo(18);
        assertThat(romanToInteger.romanToInt("XIX")).isEqualTo(19);
        assertThat(romanToInteger.romanToInt("XX")).isEqualTo(20);
        assertThat(romanToInteger.romanToInt("LVIII")).isEqualTo(58);
        assertThat(romanToInteger.romanToInt("MCMXCIV")).isEqualTo(1994);
    }
}
