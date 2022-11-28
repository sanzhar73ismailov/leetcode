package org.leetcode.sanzhar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class T15T3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        long counter = 0;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                counter++;
                if (nums[i] + nums[j] + nums[k] == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                        counter++;
                    }
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    k--;
                }
            }

        }
        System.out.println("counter = " + counter);
        return result;
    }

    public List<List<Integer>> threeSumOld(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> setOfExisted = new HashSet<>();
        Arrays.sort(nums);

        long counter = 0;

        // fori:
        for (int i = 0; i < nums.length; i++) {
            if ((i < nums.length - 1) && nums[i] + nums[i + 1] > 0) {
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
                    counter++;
                    if (j == k)
                        continue;
                    if (nums[i] + nums[j] + nums[k] > 0) {
                        break;
                    }
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        Integer[] arrSorted = {nums[i], nums[j], nums[k]};
                        // Arrays.sort(arrSorted);
                        int hashCode = Arrays.hashCode(arrSorted);
                        if (!setOfExisted.contains(hashCode)) {
                            setOfExisted.add(hashCode);
                            result.add(Arrays.asList(arrSorted));
                            break;
                        }
                    }

                }
            }
        }
        System.out.println("counter = " + counter);
        return result;
    }
}
