class Solution {
    public int longestOnes(int[] nums, int k) {
        Queue<Integer> que = new LinkedList<>();
        int max=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]==1 && k>0){
                que.add(nums[i++]);
            }else if(nums[i]==0 && k>0){
                que.add(nums[i++]);
                k--;
            }else if(nums[i]==0 && k==0){
                max=Math.max(max, que.size());
                if(!que.isEmpty()){
                    int tmp = que.poll();
                    if(tmp==0){
                        k++;
                        que.add(nums[i]);
                        if(nums[i]==0){
                            k--;
                        }
                        i++;
                    }
                }else{
                    i++;
                }
            }else{
                que.add(nums[i++]);
            }
        }
        max=Math.max(max, que.size());

        return max;
    }
}