class Solution {
    public int equalPairs(int[][] grid) {
        List<String> list = new ArrayList<>();
        String str1="";
        String str2="";
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                str1=str1+grid[i][j]+",";
            }
            list.add(str1);
            str1="";
        }

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                str2=str2+grid[j][i]+",";
            }
            for(int k=0;k<list.size();k++){
                if(list.get(k).equals(str2)){
                    count++;
                }
            }
            str2="";
        }
        return count;
    }
}