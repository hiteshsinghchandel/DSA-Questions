class Solution {
    public int maxArea(int[] heights) {

          int max = 0;
        int lef = 0;
        int rig = heights.length-1;
        while (lef<rig){
            int b = rig-lef;
            int hi = Math.min(heights[lef],heights[rig]);
            if (b*hi>max){
                max = b*hi;
            }

            if(heights[lef]<heights[rig]){
                lef++;
            }else {
                rig--;
            }


        }return  max;
    }
        
    }
