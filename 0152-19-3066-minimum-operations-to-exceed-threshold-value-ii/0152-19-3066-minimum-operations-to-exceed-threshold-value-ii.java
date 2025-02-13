class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        int count = 0;
        for(int i=0;i<nums.length;i++){
            pq.add((long)nums[i]);
        }
        while(pq.size()>1){
            if(pq.peek()>=k){
                break;
            }
            long x = pq.poll();
            long y = pq.poll();
            pq.add(Math.min(x, y)*2 + Math.max(x,y));
            count++;
        }
        return count;
    }
}