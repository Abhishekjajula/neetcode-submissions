class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String str: details){
            String s = str.substring(11,13);
            System.out.println(s);
            if(Integer.parseInt(s)>60){
                count++;
            }
        }
        return count;
    }
}