class Solution {
    public int minOperations(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int value:map.values()){
            if(value==1){
                return -1;
            }
            while(value!=0){
                if(value%2==0 && value%3==0){
                    value=value-3;
                    sum++;
                }else if(value>4 || value%3==0){
                    value=value-3;
                    sum++;
                }else if(value%2==0){
                    value=value-2;
                    sum++;
                }
            }
        }
        return sum;        
    }
}