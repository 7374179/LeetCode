class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int len = happiness.length-1;
        Arrays.sort(happiness);
        for(int i=0;i<=len;i++){
            happiness[len-i]=happiness[len-i]-i;
        }
        long sum = 0;
        for(int i=len;i>=0 && k>0;i--){
            if(happiness[i] < 1){
                break;
            }
            sum = sum + happiness[i];
            k--;
        }
        return sum;
        // long sum = 0;
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // for(int i:happiness){
        //     pq.add(i);
        // }
        // while(k>0 && !pq.isEmpty()){
        //     sum = sum + pq.poll();
        //     k--;
        //     int len = pq.size();
        //     int[] arr = new int[len];
        //     for(int i=0;i<len;i++){
        //         arr[i]=pq.poll();
        //     }
        //     for(int i=0;i<len;i++){
        //         if(arr[i]!=0){
        //             pq.add(--arr[i]);
        //         }
        //     }
        // }
        // return sum;
    }
}