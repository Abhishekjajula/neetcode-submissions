class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            result[i] = Math.abs(nums[i]);
        }
        Arrays.sort(result);
        for(int i = 0; i < n; i++){
            result[i] *= result[i] ;
        }
        return result;
    }
}