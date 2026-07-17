class Solution {
    public int search(int[] nums, int t) {
        int ans =-1;
        int a  = pivot(nums);  
        if (a == -1) {
    return bs(nums, 0, nums.length - 1, t, true);}
        int x = bs(nums,0,a,t,true);
        int y = bs(nums,a+1,nums.length-1,t,true);
        if(x!=-1){
            ans=x;
        }if(y!=-1){
            ans = y;
        }return ans;
        }

        static int bs(int []arr,int s ,int e,int t ,boolean order ){
        while (s<=e){
            int mid = s +(e-s)/2;
            if (arr[mid]==t){
                return mid;
            }
            if (order) {
    if (arr[mid] > t) {
        e = mid - 1;
    } else {
        s = mid + 1;
    }
} else {
    if (arr[mid] > t) {
        s = mid + 1;
    } else {
        e = mid - 1;
    }
}
            }
        return -1;
        }





         static int pivot(int[] arr){
        int s= 0;
        int e = arr.length-1;
        while (s<=e){
            int m = s +(e-s)/2;
            if(m<e && arr[m]>arr[m+1]){
                return m;
            }else if (m>s && arr[m]<arr[m-1]){
                return m-1;
            } else if (arr[m]<=arr[s]) {
                e = m-1 ;

            }else{
                s =m+1;
            }
        }return -1;
    
}

}