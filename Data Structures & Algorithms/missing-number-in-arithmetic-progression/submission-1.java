class Solution {
    public int missingNumber(int[] arr) {
        int difference = arr[1] - arr[0];
        for (int i = 1; i< arr.length-1; i++){
            if(arr[i+1] - arr[i] == 2*difference){
                return arr[i]+difference;
            }
        }
        return arr[0]+(difference/2);
    }
}
