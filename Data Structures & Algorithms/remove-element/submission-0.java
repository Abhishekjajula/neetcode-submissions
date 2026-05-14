class Solution {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int count = 0;
        for(int i = 0; i < length; i++){
            if(nums[i] == val){
                nums[i] = Integer.MAX_VALUE;
                count++;
            }
        }
        Arrays.sort(nums);
        return length - count;
    }
}