class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> x = new ArrayList<>();
        int firstrow = 0;
        int lastrow = matrix.length-1;
        int firstcolumn = 0;
        int lastcolumn = matrix[0].length-1;

        while(firstrow<=lastrow && firstcolumn<= lastcolumn){

            for(int i = firstcolumn;i<=lastcolumn;i++){
                x.add(matrix[firstrow][i]);
            }
            firstrow++;
            for(int i =firstrow;i<=lastrow;i++){
                x.add(matrix[i][lastcolumn]);
            }
            lastcolumn--;

            if(firstrow<=lastrow){
                for(int i = lastcolumn;i>=firstcolumn;i--){
                    x.add(matrix[lastrow][i]);
                }
                lastrow--;

            }
            if(firstcolumn<=lastcolumn){
                for(int i = lastrow;i>=firstrow;i--){
                    x.add(matrix[i][firstcolumn]);
                }firstcolumn++;
            }
            
        }
        return x;
    }
}