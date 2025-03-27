class Solution {
    public int minimumIndex(List<Integer> nums) {
        Map<Integer, Integer> firstMap = new HashMap<>();
        Map<Integer, Integer> secondMap = new HashMap<>();
        
        for(int num: nums) {
            secondMap.put(num, secondMap.getOrDefault(num, 0)+1);
        }

        for(int i=0;i<nums.size();i++){
            int num = nums.get(i);
            secondMap.put(num, secondMap.get(num)-1);
            firstMap.put(num, firstMap.getOrDefault(num, 0)+1);

            if(firstMap.get(num) * 2 > i+1 && secondMap.get(num) * 2 > nums.size() -i -1){
                return i;
            }
        }
        return -1;
    }
}