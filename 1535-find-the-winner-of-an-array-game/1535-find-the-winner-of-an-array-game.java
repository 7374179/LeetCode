class Solution {
    public int getWinner(int[] arr, int k) {
        int count=0;
        int cur=0;
        int right=1;
        int len=arr.length;
        while(count!=k){
            if(arr[cur%len]>arr[right%len]){
                right++;
                count++;
                if(count==k||count==100000){
                    return arr[cur%len];
                }
                if(cur%len==right%len){
                    right++;
                }
            }else if(arr[cur%len]<arr[right%len]){
                count=1;
                cur=right+1;
                int tmp=cur;
                cur=right;
                right=tmp;
                if(count==k||count==100000){
                    return arr[cur%len];
                }
            }
        }
        return count;
    }
}