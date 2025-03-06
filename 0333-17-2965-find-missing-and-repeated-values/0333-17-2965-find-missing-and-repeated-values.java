class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr = new int[2];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<grid.length*grid.length;i++){
            list.add(i+1);
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(list.contains(grid[i][j])){
                    list.remove(Integer.valueOf(grid[i][j]));
                } else{
                    arr[0] = grid[i][j];
                }
            }
        }
        arr[1] = list.get(0);
        return arr;
    }
}