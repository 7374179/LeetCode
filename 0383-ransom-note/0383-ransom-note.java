class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[27];
        for(int i=0;i<ransomNote.length();i++){
            int tmp = ransomNote.charAt(i)-'a';
            arr[tmp]++;
        }
        for(int i=0;i<magazine.length();i++){
            int tmp = magazine.charAt(i)-'a';
            arr[tmp]--;
        }
        for(int i=0;i<27;i++){
            if(arr[i]>0){
                return false;
            }
        }
        return true;
    }
}