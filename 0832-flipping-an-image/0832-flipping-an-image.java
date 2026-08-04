class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        reverse(image);
        invert(image);
        return image;

        
        
    }
    static void reverse(int[][] arr ){
        for(int i = 0;i<arr.length;i++){
            int x = arr[i].length-1;
            for(int j = 0;j<arr[i].length/2;j++){
                 int t =arr[i][j];
                 arr[i][j] = arr[i][x];
                 arr[i][x] = t;
                 x--;
            }
        }
    }
    static void invert(int[][] arr ){
         for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                arr[i][j] = arr[i][j]^1;
            }
         }

    }
}