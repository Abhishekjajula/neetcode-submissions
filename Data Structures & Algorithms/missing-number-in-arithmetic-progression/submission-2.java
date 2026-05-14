class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length + 1;
int expectedSum = n * (arr[0] + arr[arr.length - 1]) / 2;
int actualSum = 0;
for (int num : arr) actualSum += num;
return expectedSum - actualSum;

    }
}
