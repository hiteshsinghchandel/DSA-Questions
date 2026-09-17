class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       
        int row=matrix.length;
        int col = matrix[0].length;
        int s = 0;
        int e = row*col-1;

        while (s<=e){

            int m = s + (e-s)/2;

            int r = m/col;
            int c = m%col;


            if (matrix[r][c]==target){
                return  true;
            }
            if (matrix[r][c]>target){
                e = m-1;
            } else {
                s = m+1;

            }

        }return false;
    }
}