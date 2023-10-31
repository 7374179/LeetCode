class Solution {
    public int[] findArray(int[] pref) {
        int[] arr = new int[pref.length];
        arr[0]=pref[0];
        int tmp=arr[0];
        int sum=tmp;
        for(int i=1;i<pref.length;i++){
            tmp=sum^pref[i];
            sum=sum^tmp;
            arr[i]=tmp;
            
        }
        return arr;
    }
}