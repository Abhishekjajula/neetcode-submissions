class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> result = new HashMap<>();
        for(String str : strs){
            char[] sortedChar = str.toCharArray();
            Arrays.sort(sortedChar);
            String sortedString = Arrays.toString(sortedChar);
            result.putIfAbsent(sortedString,new ArrayList<>());
            result.get(sortedString).add(str);
        }
        return new ArrayList<>(result.values());
    }
}
