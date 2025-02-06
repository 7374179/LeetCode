class Solution {
    public int tupleSameProduct(int[] nums) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int tmp = nums[i] * nums[j];
                map.put(tmp, map.getOrDefault(tmp, 0)+1);
            }
        }
        for(int i: map.values()){
            if(i>1){
                count = count + (i * (i-1)/2) * 8;
            }
        }
        return count;
    }
}
