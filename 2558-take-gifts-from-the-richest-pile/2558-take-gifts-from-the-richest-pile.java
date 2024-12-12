class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->b-a);
        long sum = 0;
        for(int i=0;i<gifts.length;i++){
            pq.add(gifts[i]);
        }

        while(k>0){
            int tmp = (int)Math.sqrt(pq.poll());
            pq.add(tmp);
            k--;            
        }

        int j  = pq.size();

        for(int i=0;i<j;i++){
            sum = sum + pq.poll();
        }
        return sum;
    }
}