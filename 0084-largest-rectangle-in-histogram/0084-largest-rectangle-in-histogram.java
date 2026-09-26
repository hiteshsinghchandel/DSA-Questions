class Solution {
    public int largestRectangleArea(int[] h) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        st.push(0);

        for(int i = 0;i<h.length;i++){
           while(!st.isEmpty() && h[i]<h[st.peek()] ) {
            max = getMax(h,st,max,i);
           }
           st.push(i);
        }
        int i = h.length;
        while(!st.isEmpty()){
            max = getMax(h,st,max,i);
        }
        return max;        
    }

    static int getMax(int[] arr ,Stack<Integer>t,int max,int i ){
        int ar ;
        int poped = t.pop();
        if(t.isEmpty()){
            ar = arr[poped]*i;

        }else{
            ar = arr[poped]*(i-1-t.peek());
        }
        return Math.max(max,ar);
    }
}