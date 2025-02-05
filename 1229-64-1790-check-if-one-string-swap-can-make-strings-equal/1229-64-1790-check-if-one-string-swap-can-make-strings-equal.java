class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int count = 0;
        int[] arr = new int[26];
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)-'a']++;
            arr[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                return false;
            }
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
            }
        }

        return count<3;
    }
}