package org.leetcode.sanzhar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class T09isPalindromeTest {
    T09isPalindrome isPalindrome;
    @BeforeEach
    void setUp() {
        isPalindrome = new T09isPalindrome();
    }

    @Test
    void isPalindrome() {
        assertThat(isPalindrome.isPalindrome(121)).isTrue();
        assertThat(isPalindrome.isPalindrome(-121)).isFalse();
        assertThat(isPalindrome.isPalindrome(10)).isFalse();
        assertThat(isPalindrome.isPalindrome(1001)).isFalse();
    }
}
