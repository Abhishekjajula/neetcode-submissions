class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> removeDuplicates = new LinkedHashSet<>();
       for(int num:nums){
        removeDuplicates.add(num);
       }
       int i = 0;
       for (int num : removeDuplicates) {
           nums[i++] = num;
       }
       return removeDuplicates.size();
    }
}