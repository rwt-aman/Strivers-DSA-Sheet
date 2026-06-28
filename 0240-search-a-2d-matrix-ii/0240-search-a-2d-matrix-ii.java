class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;

        int row = 0;
        int col = matrix[0].length - 1; // start at top-right
        
        while (row < matrix.length && col >= 0) {
            int val = matrix[row][col];
            if (val == target) {
                return true;
            } else if (val > target) {
                col--; // eliminate this column
            } else {
                row++; // eliminate this row
            }
        }
        return false;
    }
}