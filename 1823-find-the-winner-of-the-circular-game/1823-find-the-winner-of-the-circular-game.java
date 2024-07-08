class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> que = new LinkedList<>();
        int count = k;
        for(int i=1;i<=n;i++){
            que.add(i);
        }
        while(que.size()!=1){
            count--;
            int tmp = que.poll();
            if(count!=0){
                que.add(tmp);
            }else{
                count = k;
            }
        }
        return que.peek();
    }
}