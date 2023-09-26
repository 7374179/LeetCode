class Solution {
    public int hIndex(int[] citations) {
        // if(citations.length==1){
        //     if(citations[0]==0){
        //         return 0;   
        //     }
        //     else if(citations[0]==1){
        //         return 1;
        //     }
        // }
        Arrays.sort(citations);
        int[] arr = new int[citations.length];
        int max = Integer.MIN_VALUE;

        for(int i=0;i<citations.length;i++){
            if(citations[citations.length-1-i]>=i+1){
                if(max<i){
                    max=i;
                }
            }
        }
        if(max==Integer.MIN_VALUE){
            return 0;
        }
        return max+1;
    }
}