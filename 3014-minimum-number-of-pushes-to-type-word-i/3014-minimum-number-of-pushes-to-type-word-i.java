class Solution {
    public int minimumPushes(String word) {
        int sum=0;
        int[] arr = new int[26];
        for(int i=0;i<word.length();i++){
            arr[word.charAt(i)-'a']++;
        }
        
        // Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr);
        
        // for(int i=0;i<word.length();i++){
        //     sum=sum+arr[i]*((i/8)+1);
        // }
        
        for(int i=arr.length-1;i>=arr.length-word.length();i--){
            sum=sum+arr[i]*((25-i)/8+1);
        }
        
        
        return sum;
    }
}