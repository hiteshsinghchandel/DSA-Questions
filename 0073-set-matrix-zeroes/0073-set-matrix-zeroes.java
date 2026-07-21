class Solution {
    public void setZeroes(int[][] arr) {
        int[][] x = new int [arr.length][arr[0].length];
    for(int i = 0;i<arr.length;i++){
        for(int j = 0;j<arr[i].length;j++){
            x[i][j] = arr[i][j];
            }
        }

    for (int i = 0; i < arr.length ; i++) {
        for (int j = 0; j < arr[i].length ; j++) {
            if(x[i][j]==0){
                for(int row = 0;row<arr.length;row++){
                    arr[row][j]=0;
                }for(int col = 0;col<arr[i].length ;col++){
                    arr[i][col] = 0;}

        }

    }
    }
        
    }
}