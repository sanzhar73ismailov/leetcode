package org.leetcode.sanzhar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class T15T3SumTest {

    T15T3Sum t15T3Sum;

    @BeforeEach
    void setUp() {
        t15T3Sum = new T15T3Sum();
    }

    @Test
    void threeSum() {
        int[] nums = {3, 0, -2, -1, 1, 2};
        List<List<Integer>> listsActual = t15T3Sum.threeSum(nums);
        assertThat(listsActual).hasSize(3);
        assertThat(listsActual).contains(List.of(-2, -1, 3))
                .contains(List.of(-2, -1, 3))
                .contains(List.of(-1, 0, 1));
    }
}
