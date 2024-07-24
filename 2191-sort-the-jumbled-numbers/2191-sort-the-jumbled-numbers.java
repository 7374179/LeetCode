class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int[][] arr = new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            arr[i][0] = nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int tmp = 0;
            int num = 0;
            int map = 0;
            int j=1;
            tmp = nums[i];
            while(tmp>=0){
                num = tmp % 10;
                map = map + mapping[num] * j;
                j = j * 10;
                tmp = tmp / 10;
                if(tmp == 0){
                    break;
                }
            }
            arr[i][1] = map;
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
        for(int i=0; i<nums.length; i++){
            nums[i] = arr[i][0];
        }
        return nums;
    }
}