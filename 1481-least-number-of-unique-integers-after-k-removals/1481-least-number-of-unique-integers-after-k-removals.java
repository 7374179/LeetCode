class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int result=0;
        for(int num:arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            k=k-list.get(i);
            if(k==0){
                result=list.size()-i-1;
                break;
            }else if(k<0){
                result=list.size()-i;
                break;
            }
        }
        return result;
    }
}
