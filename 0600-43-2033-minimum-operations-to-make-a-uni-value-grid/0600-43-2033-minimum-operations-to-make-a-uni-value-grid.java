class Solution {
    public int minOperations(int[][] grid, int x) {
        int[] arr = new int[grid.length * grid[0].length];
        int k = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                arr[k++] = grid[i][j];
            }
        }
        int count = 0;
        Arrays.sort(arr);
        int mid = arr.length/2;
        for(int i=0;i<arr.length;i++){
            int num = Math.abs(arr[mid]-arr[i]);
            if(num%x!=0){
                return -1;
            }
            count = count + num/x;
        }
        return count;
    }
}