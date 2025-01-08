class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                String str1 = words[i];
                String str2 = words[j];
                if(str1.length() <= str2.length() && str1.equals(str2.substring(0, str1.length())) && str1.equals(str2.substring(str2.length()-str1.length(), str2.length()))){
                    count++;
                }
            }
        }
        return count;
    }
}