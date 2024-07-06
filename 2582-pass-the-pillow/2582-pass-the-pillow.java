class Solution {
    public int passThePillow(int n, int time) {
        Queue<Integer> que = new LinkedList<>();
        for(int i=1;i<=n;i++){
            que.add(i);
        }
        for(int i=n-1;i>1;i--){
            que.add(i);
        }

        while(time>0){
            que.add(que.poll());
            time--;
        }

        return que.poll();
    }
}