package com.civism.guava.leetcode.demo03;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Guava
 * @version 1.0
 * @projectName：civism-guava
 * @className：Solution
 * @date 2020/1/17 7:43 下午
 * @E-mail:gongdexing@oxyzgroup.com
 * @Copyright: 版权所有 (C) 2020 蓝鲸淘.
 * @return
 */
public class Solution {

//    给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
//
//    示例 1:
//
//    输入: "abcabcbb"
//    输出: 3
//    解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
//    示例 2:
//
//    输入: "bbbbb"
//    输出: 1
//    解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
//    示例 3:
//
//    输入: "pwwkew"
//    输出: 3
//    解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//                 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
//
//    来源：力扣（LeetCode）
//    链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
//    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        for (int i = 0; i < s.length(); i++) {

            Set<Character> characters = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                boolean add = characters.add(c);
                if (!add) {
                    j = s.length();
                }
                if (characters.size() > len) {
                    len = characters.size();
                }
            }
        }
        return len;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.lengthOfLongestSubstring("bbbbb");
        System.out.println(i);
    }
}
