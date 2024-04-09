class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;

        while(tickets[k]!=0){
            for(int j=0;j<tickets.length;j++){
                if(tickets[j]!=0){
                    tickets[j]--;
                    count++;
                }
                if(tickets[k]==0){
                    return count;
                }
            }
        }
        return count;
    }
}