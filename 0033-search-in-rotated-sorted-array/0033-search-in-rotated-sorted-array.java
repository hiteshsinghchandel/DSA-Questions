class Solution {
    public int search(int[] nums, int target) {

        int p = pivot(nums);
        if(target >=nums[0] && target<=nums[p]){
            return bs(nums,0,p,target);
        }else{
            return bs(nums,p+1,nums.length-1,target);
        }
        
    }

    static int pivot(int[] arr){
        int s = 0;
        int e = arr.length-1;

        if(e ==0){
            return 0;
        }

        while(s<e){
            int m = s + (e-s)/2;

           
            if(m<e && arr[m]>arr[m+1]){
                return m ;
            }if(m>s && arr[m]<arr[m-1]){
                return m-1;
            }

            if(arr[s]<= arr[m]){
                s = m+1;
            }else{
                e = m-1;
            }
        }return s;
    }

    static int bs(int[] arr,int s,int e ,int t ){
        

        while(s<=e){
            int m = s + (e-s)/2;
            if(arr[m]==t){
                return m;
            }
            if(arr[m]>t){
                e = m-1;
            }else{
                s = m+1;
            }
        }
        return -1;

    }
}
