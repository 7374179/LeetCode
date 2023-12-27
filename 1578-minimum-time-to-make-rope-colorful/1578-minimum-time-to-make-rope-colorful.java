class Solution {
    public int minCost(String colors, int[] neededTime) {
        int sum=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<neededTime.length-1;i++){
            if(colors.charAt(i)==colors.charAt(i+1)){
                int j=i+1;
                int count=0;
                while(j<colors.length()){
                    if(colors.charAt(i)==colors.charAt(j)){
                        count++;
                        j++;
                    }else{
                        break;
                    }
                }
                for(int k=i;k<=count+i;k++){
                    pq.add(neededTime[k]);
                }
                while(pq.size()>1){
                    sum=sum+pq.poll();
                }
                pq.remove();
                i=j-1;
            }
        }
        return sum;
    }
}