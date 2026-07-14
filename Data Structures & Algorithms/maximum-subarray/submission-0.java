
public class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;

        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 0; i < nums.length; i++) {
            // Reset window if current path drags us down
            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i;
            }

            currentSum += nums[i];

            // Found a better subarray, lock in the indices
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }
        int[] res = new int[end - start+1 ];
        for (int i = 0; i < end-start+1; i++) {
            res[i] = nums[start+i];
        System.out.println(res[i]);

        }
        // Copy and return the exact window range
        return maxSum;
    }
}
