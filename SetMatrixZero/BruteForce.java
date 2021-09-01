/*
Question link : https://leetcode.com/problems/set-matrix-zeroes/
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's, and return the matrix.

You must do it in place.

 

Example 1:


Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]*/

class Solution {
    
    public void setZeroes(int[][] matrix)
    {
        int i,j,flag;
        for(i=0;i<matrix.length;i++)
        {
            flag = 0;
            for(j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j] == 0)
                {
                    for(int k=0;k<matrix.length;k++)
                        if(matrix[k][j] != 0)
                            matrix[k][j] = -100001;
                    for(int k=0;k<matrix[0].length;k++)
                        if(matrix[i][k] != 0)
                            matrix[i][k] = -100001;
                }
            }
        }
        for(i=0;i<matrix.length;i++)
        {
            for(j=0;j<matrix[0].length;j++)
                if(matrix[i][j] == -100001)
                    matrix[i][j] = 0;
        }
    }
}
