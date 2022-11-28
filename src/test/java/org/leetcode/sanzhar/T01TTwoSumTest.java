package org.leetcode.sanzhar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class T01TTwoSumTest {
    T01TTwoSum t01TTwoSum;

    @BeforeEach
    void setUp() {
        t01TTwoSum = new T01TTwoSum();
    }

    @Test
    void twoSum() {
        int[] inputNums = {2, 7, 11, 15};
        assertThat(t01TTwoSum.twoSum(inputNums, 9))
                .containsExactly(new int[]{0, 1});
    }

    @Test
    void twoSumCase2() {
        int[] inputNums = {3, 2, 4};
        assertThat(t01TTwoSum.twoSum(inputNums, 6))
                .containsExactly(new int[]{1, 2});
    }
}
