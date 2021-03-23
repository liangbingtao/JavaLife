package com.neo.dataStructure;

/**
 * @Description Author neo
 * Date 2021/3/14 16:46
 */
public class MaxValue {

    public int maxValue(int[][] grid) {
        int m = grid.length;     //获得行数
        int n = grid[0].length;   //获得列数

        /*
        //方法一
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    continue;
                } else if (i == 0) {
                    grid[i][j] = grid[i][j] + grid[i][j - 1];
                } else if (j == 0) {
                    grid[i][j] = grid[i][j] + grid[i - 1][j];
                } else {
                    grid[i][j] = grid[i][j] + Math.max(grid[i - 1][j], grid[i][j - 1]);
                }
            }
        }
        return grid[m - 1][n - 1];
*/

        //方法二
        for (int i = 1; i < m; i++) {  //初始化第一列
            grid[i][0] = grid[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < n; j++) {  //初始化第一行
            grid[0][j] += grid[0][j - 1];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.max(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[m - 1][n - 1];
    }


    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        MaxValue maxValue = new MaxValue();
        int res = maxValue.maxValue(grid);
        System.out.println(res);
    }
}
