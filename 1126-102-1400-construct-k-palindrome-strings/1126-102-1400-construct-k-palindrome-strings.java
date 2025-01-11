class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k){
            return false;
        }
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[s.charAt(i)-'a'] = arr[s.charAt(i)-'a']%2;
        }
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
        }
        return count<=k;
    }
}