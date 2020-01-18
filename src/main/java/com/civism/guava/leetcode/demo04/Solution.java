package com.civism.guava.leetcode.demo04;

import java.util.Arrays;

/**
 * @author : Guava
 * @version 1.0
 * @projectName：civism-guava
 * @className：Solution
 * @date 2020/1/17 8:28 下午
 * @E-mail:gongdexing@oxyzgroup.com
 * @Copyright: 版权所有 (C) 2020 蓝鲸淘.
 * @return
 */
public class Solution {

//    给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
//
//    请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
//
//    你可以假设 nums1 和 nums2 不会同时为空。
//
//    来源：力扣（LeetCode）
//    链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
//    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] max = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, max, 0, nums1.length);
        System.arraycopy(nums2, 0, max, nums1.length, nums2.length);

        Arrays.sort(max);

        int l = max.length % 2;
        if (l != 0) {
            return max[max.length / 2];
        } else {
            int m = max.length / 2;
            return (double) (max[m] + max[m - 1]) / 2;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3, 4 };
        double medianSortedArrays = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }
}
