package com.civism.guava.leetcode;

import java.util.List;

/**
 * @author : Guava
 * @version 1.0
 * @projectName：civism-guava
 * @className：Test01
 * @date 2019-11-20 16:40
 * @E-mail:gongdexing@oxyzgroup.com
 * @Copyright: 版权所有 (C) 2019 蓝鲸淘.
 * @return
 */
public class Test01 {
    /**
     * 给你一个 n 行 m 列的二维网格 grid 和一个整数 k。你需要将 grid 迁移 k 次。
     * <p>
     * 每次「迁移」操作将会引发下述活动：
     * <p>
     * 位于 grid[i][j] 的元素将会移动到 grid[i][j + 1]。
     * 位于 grid[i][m - 1] 的元素将会移动到 grid[i + 1][0]。
     * 位于 grid[n - 1][m - 1] 的元素将会移动到 grid[0][0]。
     * 请你返回 k 次迁移操作后最终得到的 二维网格。
     * <p>
     * 输入：grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
     * 输出：[[9,1,2],[3,4,5],[6,7,8]]
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/shift-2d-grid
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param args
     */


    public static void main(String[] args) {
        int[][] grid = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 1;
    }

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        if (k <= 0) {
            return null;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {


            }
        }


        return null;
    }
}
