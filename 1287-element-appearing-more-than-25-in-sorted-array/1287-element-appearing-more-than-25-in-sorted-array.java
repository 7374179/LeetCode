class Solution {
    public int findSpecialInteger(int[] arr) {
        int len=arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])>len*0.25){
                return arr[i];
            }
        }
        return 0;
    }
}