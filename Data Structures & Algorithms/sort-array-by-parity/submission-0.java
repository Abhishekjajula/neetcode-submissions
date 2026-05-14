class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int length = nums.length;
        if(length < 2){
            return nums;
        }
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        for(int i = 0; i < length; i++){
            if(nums[i]%2 == 0){
                evenList.add(nums[i]);
            }
            else{
                oddList.add(nums[i]);
            }
        }
        int[] result = new int[length];
        for(int i = 0 ; i < evenList.size(); i++){
            result[i] = evenList.get(i);
        }
        for(int i = 0 ; i < oddList.size(); i++){
            result[i+evenList.size()] = oddList.get(i);
        }

        return result;
    }
}