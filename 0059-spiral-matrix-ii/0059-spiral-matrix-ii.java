class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int rows= 0;
        int rowe = n-1;
        int cols = 0;
        int cole = n-1;
        int x = 1;
        while(cols <= cole && rows<=rowe){
            for(int col = cols;col<=cole;col++){
                arr[rows][col]=x++;
            }rows++;
            for(int row = rows;row<=rowe;row++){
                arr[row][cole] = x++;
            }cole--;
            for(int i = cole;i>=cols;i--){
                arr[rowe][i]=x++;
            }rowe--;
            for(int j = rowe;j>=rows;j--){
                arr[j][cols] =x++;
            }cols++;

        }return arr;
        
    }
}