class Solution {
    public int singleNumber(int[] nums) {
                HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i< nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue().equals(1)){
                max = entry.getKey();

            }
        }
        return max;
    }
}
