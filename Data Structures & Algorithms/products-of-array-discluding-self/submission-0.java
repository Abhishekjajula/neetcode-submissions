class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1,zeroCnt = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                product*=nums[i];
            }
            else{
                zeroCnt++;
            }
        }
        if(zeroCnt>1){
            return new int[nums.length];
        }
        int[] res = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            if(zeroCnt>0){
                res[i] = (nums[i]==0)?product:0;
            }
            else{
                res[i] = product/nums[i];
            }
        }
        return res;
    }
}  
