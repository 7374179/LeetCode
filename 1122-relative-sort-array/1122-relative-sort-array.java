class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length];
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int j = 0;
        for(int num:arr1){
            list.add(num);
        }
        for(int i=0;i<arr2.length;i++){
            int num = arr2[i];
            while(list.contains(num)){
                arr[j++] = num;
                list.remove(Integer.valueOf(num));
            }
        }
        if(!list.isEmpty()){
            for(int i=0;i<list.size();i++){
                pq.add(list.get(i));
            }
        }
        while(!pq.isEmpty()){
            arr[j++] = pq.poll();
        }
        return arr;
    }
}