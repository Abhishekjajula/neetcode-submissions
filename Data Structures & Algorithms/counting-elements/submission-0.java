class Solution {
    public int countElements(int[] arr) {
        Set<Integer> uniqueElements = new HashSet<>();
        for(int num:arr){
            uniqueElements.add(num);
        }
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(uniqueElements.contains(arr[i]+1)){
                count++;
            }
        }
        return count;

    }
}
