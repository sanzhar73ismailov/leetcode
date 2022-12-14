package org.leetcode.sanzhar;

import java.util.Arrays;

public class T04MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, result, 0, nums1.length);
        System.arraycopy(nums2, 0, result, nums1.length, nums2.length);
        Arrays.sort(result);
        return result.length % 2 == 1 ? result[result.length / 2] :
                (result[result.length / 2 - 1] + result[result.length / 2]) / 2.0;
    }

    //1 2 3 4
    public static void main(String[] args) {

        double medianSortedArrays = new T04MedianOfTwoSortedArrays().findMedianSortedArrays(new int[]{1, 3}, new int[]{2, 4});
        System.out.println("medianSortedArrays = " + medianSortedArrays);

    }
}
