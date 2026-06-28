class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int srt = 0;
        int end = m * n -1;

        while(srt <= end){
            int mid = srt + (end - srt) / 2;
            int row = mid / n;
            int col = mid % n;

            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                srt = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
}