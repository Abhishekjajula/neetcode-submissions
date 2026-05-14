class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,n = nums.length - 1;
        while(l<=n){
            int mid= (l+n)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]> target){
                n=mid -1;
            }
            else{
                l = mid+1;
            }
        }
        return l;

} 
}