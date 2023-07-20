class Solution {
    public int minimumKeypresses(String s) {
        int[] arr = new int[26];

        for(int i=0;i<s.length();i++){
            int tmp=s.charAt(i)-'a';
            arr[tmp]++;
        }

        Arrays.sort(arr);
        int sum=0;
        int count=0;
        for(int i=25;i>=0;i--){
            sum+=arr[i]*(count/9+1);
            count++;
            if(arr[i]==0){
                break;
            }
        }
        return sum;
    }
}