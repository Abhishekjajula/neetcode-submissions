class Solution {
    public int buyChoco(int[] prices, int money) {
        int minSum = Integer.MAX_VALUE;
        for(int i = 0; i< prices.length; i++){
        for(int j = i+1; j< prices.length; j++){
            int sum = prices[i]+prices[j];
            if(sum<=money){
            System.out.println(sum);
            minSum = Math.min(sum,minSum);}
        }
        }
        return money-minSum>=0?money-minSum:money;
    }
}