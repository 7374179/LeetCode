class Solution {
    public int[] countBits(int n) {
        int[] tmp = new int[n+1];
        // for(int i=0;i<=n;i++){
        //     tmp[i]=i;
        // }

        for(int i=0;i<=n;i++){
            int bi = i;
            int count=0;
            while(bi>0){
                int ai = bi%2;
                bi=bi/2;
                if(ai==1){
                    count++;
                }

            }
            tmp[i]=count;
        }
        return tmp;
    }
}
