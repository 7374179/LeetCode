class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[52];
        int max = 0;
        int odd = 0;
        for(int i=0;i<s.length();i++){
            if('A'<=s.charAt(i) && s.charAt(i)<='Z'){
                arr[s.charAt(i)-65]++;
            }else{
                arr[s.charAt(i)-97+26]++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>odd){
                odd=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                max=max+arr[i]-1;
            }else{
                max=max+arr[i];
            }
        }
        if(s.length()==max){
            return max;
        }
        return max+1;
    }
}