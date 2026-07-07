class Solution {
    public int trap(int[] height) {
        if(height == null || height.length == 0){return 0;}
        int len = height.length;
        int res = 0;
        for(int i = 0; i <  len; i++){
            int leftMax=height[i],rightMax=height[i];
            for(int j = 0; j < i ; j++){
                leftMax = Math.max(leftMax,height[j]);
            }
            for(int j = i+1; j <  len; j++){
                rightMax = Math.max(rightMax,height[j]);
            }
            res += Math.min(leftMax,rightMax) - height[i]; 
        }
        return res;
    }
}
