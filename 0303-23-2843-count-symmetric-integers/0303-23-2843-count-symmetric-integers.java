class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i=low;i<=high;i++){
            String str = i+"";
            if(str.length()%2==1){
                // i = i * 10;
                continue;
            }
            int n = str.length()/2;
            int sumStart = 0;
            int sumEnd = 0;
            for(int j=0;j<n;j++){
                sumStart = sumStart + str.charAt(j)-'0';
                sumEnd = sumEnd + str.charAt(str.length()-1-j)-'0';
            }
            if(sumStart==sumEnd){
                count++;
            }
        }
        return count;
    }
}