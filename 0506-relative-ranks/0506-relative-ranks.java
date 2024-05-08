class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] str = new String[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<score.length;i++){
            pq.add(score[i]);
        }
        int count = 0;
        int tmp = 0;
        while(!pq.isEmpty()){
            int num = pq.poll();
            tmp++;
            for(int i=0;i<score.length;i++){
                if(num==score[i]){
                    count = i;
                    break;
                }
            }
            if(tmp == 1){
                str[count] = "Gold Medal";
            }else if(tmp == 2){
                str[count] = "Silver Medal";
            }else if(tmp == 3){
                str[count] = "Bronze Medal";
            }else{
                str[count] = tmp+"";
            }
        }
        return str;
    }
}