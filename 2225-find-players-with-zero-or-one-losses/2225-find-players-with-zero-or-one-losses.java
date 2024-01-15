class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int min=Integer.MAX_VALUE;
        int max=0;
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<matches.length;i++){
            for(int j=0;j<matches[i].length;j++){
                min=Math.min(min, matches[i][j]);
                max=Math.max(max, matches[i][j]);
            }
        }
        int[][] arr = new int[max-min+1][2];
        for(int i=0;i<matches.length;i++){
            arr[matches[i][0]-min][0]++;
            arr[matches[i][1]-min][1]++;
        }

        List<Integer> listWin = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i][1]==0 && arr[i][0]!=0){
                listWin.add(i+min);
            }
        }
        list.add(listWin);
        List<Integer> listLose = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i][1]==1){
                listLose.add(i+min);
            }
        }
        list.add(listLose);

        return list;
    }
}