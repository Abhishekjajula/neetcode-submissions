class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        // for(int i = 0; i< length; i++){
        //     for(int j = i+1; j < length;j++){
        //         if(nums[i]+nums[j]== target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{0,0};

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < length; i++){
            int num = nums[i];
            int difference = target - num;
            if(map.containsKey(difference)){
                return new int[]{map.get(difference),i};
            }
            map.put(num,i);
        }
        return new int[]{0,0};

    }
}
