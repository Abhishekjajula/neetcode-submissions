class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nums1Indexes = new HashMap<>();
        int n1len = nums1.length;
        int n2len = nums2.length;
        for(int i = 0; i < n1len; i++){
            nums1Indexes.put(nums1[i],i);
        }
        int[] res = new int[n1len];
        Arrays.fill(res, -1);
        for(int i = 0; i < n2len; i++){
            if(!nums1Indexes.containsKey(nums2[i])){
                continue;
            }
            for(int j = i + 1; j < n2len; j++){
                if(nums2[j]>nums2[i]){
                    int index = nums1Indexes.get(nums2[i]);
                    res[index] = nums2[j];
                    break;
                }
            }
        }
        return res;
    }
}