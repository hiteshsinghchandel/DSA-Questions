class Solution {
    public int search(int[] nums, int target) {
        return search(nums,target,0,nums.length-1);

        
    }
    static int search(int[] arr,int t ,int s,int e){
        if (s>e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid]==t){
            return mid;
        }

        if (arr[s]<arr[mid]){
            if (t>=arr[s] && t<=arr[mid]){
                return search(arr,t,s,mid-1);
            }else {
                return search(arr,t,mid+1,e);
            }
        }
        if (t>=arr[mid]&& t<=arr[e]){
            return search(arr,t,mid+1,e);
        }return search(arr,t,s,mid-1);
    }
} 