class Solution {
    public int trap(int[] height) {
                int water = 0;

        int lef = 0;
        int right = height.length-1;

        int i =0;
        int j = 0;


        while (lef<right ){

            if (height[right]>=height[lef]){

                if (height[lef]>=i){
                    i = height[lef];
                }else {
                    water = water + i - height[lef];
                }
                lef++;
            }else {
                if (height[right]>=j){
                    j = height[right];
                }else {
                    water = water + j -height[right];
                }
                right--;
            }




        }
        return water;
        
    }
}