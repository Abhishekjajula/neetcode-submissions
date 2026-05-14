class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        for(int i = 0; i< n-1; i++){
            Arrays.sort(stones);
            int difference = stones[n-1] - stones[n-2];
            if(difference == 0){
                stones[n-1] = 0;
                stones[n-2] = 0; 
            }
            else {
                stones[n-2] = difference;
                stones[n-1] = 0;
            }
        }
                    Arrays.sort(stones);

        return stones[n-1];
    }
}
