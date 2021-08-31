/*
Link : https://leetcode.com/problems/search-a-2d-matrix-ii/
Write an efficient algorithm that searches for a target value in an m x n integer matrix. The matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
 

Example 1:


Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true
*/

class Solution {
    public boolean searchMatrix(int[][] A, int t) {
        /*int i,j;
        for(i=0;i<matrix.length;i++)
        {
            if(matrix[i][matrix[0].length-1] < target)
                continue;
            for(j=0;j<matrix[0].length;j++)
            {
                
                if(matrix[i][j] == target)
                    return true;
                if(matrix[i][j] > target)
                {
                    System.out.println(matrix[i][j]);
                    break;
                }
                    
            }
            
        }
        return false;*/
        int M = A.length, N = A[0].length;
        int r = M - 1, c = 0;
        while (r >= 0 && c < N) {
          if (A[r][c] == t) return true;
          if (A[r][c] < t) c++;
          else r--;
        }
        return false;
    }
}
