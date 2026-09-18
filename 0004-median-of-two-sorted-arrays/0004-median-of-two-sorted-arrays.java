class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
     int[] arr = newa(num1,num2);
     Arrays.sort(arr);

        if (arr.length%2==0){
            int a = arr.length/2;
            int b = (arr.length/2)-1;


            return (double)(arr[a]+arr[b])/2;
        }
        return arr[arr.length/2];
    }
     static  int[] newa(int[] num1,int[] num2){
        int[] arr = new int[num2.length+num1.length];

        for (int i = 0; i < arr.length; i++) {
            if (i<num1.length){
                arr[i]= num1[i];
            }else {
                arr[i] = num2[i-num1.length];
            }

        }return arr;
    }
}
