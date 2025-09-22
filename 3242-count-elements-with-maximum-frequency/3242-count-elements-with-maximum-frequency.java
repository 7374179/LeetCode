class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr = new int[101];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        int max = 0;
        for(int i=0;i<=100;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int count = 0;
        for(int i=0;i<=100;i++){
            if(arr[i]==max){
                count = count + arr[i];
            }
        }
        return count;
    }
}