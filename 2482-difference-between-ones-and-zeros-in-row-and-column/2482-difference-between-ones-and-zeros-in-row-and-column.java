class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[] row = new int[grid.length];
        int[] col = new int[grid[0].length];
        int[][] diff = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    row[i]++;
                }
            }
        }

        for(int i=0;i<grid[0].length;i++){
            for(int j=0;j<grid.length;j++){
                if(grid[j][i]==1){
                    col[i]++;
                }
            }
        }

        for(int i=0;i<diff.length;i++){
            for(int j=0;j<diff[i].length;j++){
                diff[i][j]=row[i]+col[j]-(grid.length-row[i])-(grid[i].length-col[j]);
            }
        }

        return diff;
    }
}