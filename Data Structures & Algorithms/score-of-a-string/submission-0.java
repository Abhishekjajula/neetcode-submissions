class Solution {
    public int scoreOfString(String s) {
        char[] str = s.toCharArray();
        int score = 0;
        for(int i = 0; i < s.length()-1; i++){
            score += Math.abs(str[i]-str[i+1]);
        }
        return score;
    }
}