class Solution {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        int count=0;
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==1){
                flag=true;
                count=i;
                break;
            }
        }
        if(count==0 && !flag){
            return -1;
        }
        return count;
    }
}