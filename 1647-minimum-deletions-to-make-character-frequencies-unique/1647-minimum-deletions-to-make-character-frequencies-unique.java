class Solution {
    public int minDeletions(String s) {
        int[] arr = new int[26];
        int length = Math.max(s.length(), 26);
        int[] num = new int[length];
        int count=0;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                continue;
            }
            num[arr[i]]++;
        }
        int i=0;
        while(i<num.length){
            if(num[i]>1){
                num[i]--;
                if(i==0){
                    continue;
                    // count++;
                }else{
                    i--;
                    num[i]++;
                    count++;
                }
            }else{
                i++;
            }
            
        }

        return count;
    }
}