class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] arr = new int[gas.length];
        int sum=0;
        int num=0;
        for(int i=0;i<gas.length;i++){
            arr[i]=gas[i]-cost[i];
            sum+=arr[i];
        }
        if(sum<0){
            return -1;
        }
        int count=0;
        while(count<gas.length){
            boolean flag=true;
            if(arr[count]<=0){
                count++;
            }else{
                int sum1=0;
                int sum2=0;
                for(int i=count;i<gas.length;i++){
                    sum1+=arr[i];
                    if(sum1<0){
                        flag=false;
                        break;
                    }
                }
                for(int i=0;i<count;i++){
                    sum2+=arr[i];
                    int tmp=sum1+sum2;
                    if(tmp<0){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    num=count;                
                }
                count++;
            }
        }
        return num;
    }
}