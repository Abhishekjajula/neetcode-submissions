class Solution {
    public int lengthOfLastWord(String s) {
        String removeTrailingSpaces = s.trim();
        char[] ch = removeTrailingSpaces.toCharArray();
        char space = ' '; 
        int indexOfLastSpace = 0;
        for(int i = 0; i < removeTrailingSpaces.length(); i++){
            if(ch[i] == space){
                indexOfLastSpace = i;
            }
        }
        if(indexOfLastSpace == 0){
            return removeTrailingSpaces.length();
        }
        
        return removeTrailingSpaces.substring(indexOfLastSpace+1,removeTrailingSpaces.length()).length();
    }
}