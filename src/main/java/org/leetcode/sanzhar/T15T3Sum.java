package org.leetcode.sanzhar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class T15T3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> setOfExisted = new HashSet<>();
        Arrays.sort(nums);

       // fori:
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            forj:
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] > 0) {
                    break;
                }
                if (i == j)
                    continue;
                //if (j < nums.length - 1 && nums[i] + nums[j] + nums[j + 1] > 0) {
                //    continue;
               // }
                for (int k = j + 1; k < nums.length; k++) {
                    if (j == k)
                        continue;
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        Integer[] arrSorted = {nums[i], nums[j], nums[k]};
                        // Arrays.sort(arrSorted);
                        int hashCode = Arrays.hashCode(arrSorted);
                        if (!setOfExisted.contains(hashCode)) {
                            setOfExisted.add(hashCode);
                            result.add(Arrays.asList(arrSorted));
                            break ;
                        }
                    }
                }
            }
        }
        return result;
    }
}
