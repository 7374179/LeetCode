class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((n1, n2)->map.get(n1)-map.get(n2));

        for(int n : map.keySet()){
            pq.add(n);
            if(pq.size()>k){
                pq.poll();
            }
        }
        for(int i=k-1;i>=0;i--){
            arr[i]=pq.poll();
        }
        return arr;
    }
}