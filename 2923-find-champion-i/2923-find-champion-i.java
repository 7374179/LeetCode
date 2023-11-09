class Solution {
    public int findChampion(int[][] grid) {
        int[] count = new int[grid.length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(grid[i][j]==1){
                    count[i]++;
                }
            }
        }
        int max=0;
        for(int i=0;i<count.length;i++){
            if(count[i]>count[max]){
                max=i;
            }
        }
        return max;
    }
}