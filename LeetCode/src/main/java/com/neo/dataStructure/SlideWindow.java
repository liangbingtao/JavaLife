package com.neo.dataStructure;

import java.util.Arrays;

/**
 * @Description Author neo
 * Date 2021/3/13 21:56
 */
public class SlideWindow {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] res = new int[nums.length - k + 1];

        for (int i = 0; i < nums.length - k + 1; i++) {
            int max = nums[i];
            for (int j = i; j < i + k - 1; j++) {
                max = max > nums[j + 1] ? max : nums[j + 1];
            }
            res[i] = max;
        }
        System.out.println(Arrays.toString(res));
    }
}
