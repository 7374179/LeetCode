class Solution {
    public int maximumSum(int[] nums) {
        int[][] arr = new int[nums.length][2];
        int max = 0;
        int result = 0;
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int sum = 0;
            while(num>0){
                sum = sum + num%10;
                num = num/10;
            }
            arr[i][0] = nums[i];
            arr[i][1] = sum;
        }
        
        Arrays.sort(arr, (a, b) -> {
            if(a[1] == b[1]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });

        for(int i=0;i<nums.length-1;i++){
            if(arr[i][1] == arr[i+1][1]){
                result = arr[i][0] + arr[i+1][0];
            }
            if(result>max){
                max = result;
            }
        }
        if(max == 0){
            return -1;
        }
        return max;
    }
}