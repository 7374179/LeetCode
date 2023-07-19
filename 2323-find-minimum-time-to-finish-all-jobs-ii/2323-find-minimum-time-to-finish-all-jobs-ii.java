class Solution {
    public int minimumTime(int[] jobs, int[] workers) {
        Arrays.sort(jobs);
        Arrays.sort(workers);

        int max=Integer.MIN_VALUE;

        for(int i=0;i<jobs.length;i++){
            int num=jobs[i]/workers[i];
            if(jobs[i]%workers[i]!=0){
                num++;
            }
            max=Math.max(max, num);
        }

        if(max==0){
            return max+1;
        }
        return max;
    }
}