class Solution {
    public int largestUniqueNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int largest = -1; 
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) { 
            if (entry.getValue() == 1) {
                 largest = Math.max(largest, entry.getKey());
            } 
        }
        return largest;
    }
}
