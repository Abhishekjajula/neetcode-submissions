class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        int count = 0, length = nums.length;
        for (int i = 0; i< length; i++){
            if(nums[i] == target){
                count++;
            }
        }
        return count > (length/2);
    }
}
