class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            List<Integer> dist = new ArrayList<>();
            if(!dist.contains(nums[i])){
                dist.add(nums[i]);
            }
        }

        int i=0;
        int count=0;
        while(count<nums.length){
            List<Integer> dist = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if(!dist.contains(nums[j]) && nums[j]!=0){
                    dist.add(nums[j]);
                    nums[j]=0;
                    count++;
                }
            }
            list.add(dist);
        }
        return list;
    }
}