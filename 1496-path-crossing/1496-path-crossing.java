class Solution {
    public boolean isPathCrossing(String path) {
        List<List<Integer>> list = new ArrayList<>();
        int[][] arr = new int[1][2];
        list.add(new ArrayList<>(Arrays.asList(0,0)));
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='N'){
                arr[0][1]++;
            }else if(path.charAt(i)=='E'){
                arr[0][0]++;
            }else if(path.charAt(i)=='S'){
                arr[0][1]--;
            }else if(path.charAt(i)=='W'){
                arr[0][0]--;
            }
            List<Integer> tempList = new ArrayList<>();
            for(int[] innerArr : arr){
                for(int elem : innerArr){
                    tempList.add(elem);
                }
            }
            if(list.contains(tempList)){
                return true;
            }else{
                list.add(tempList);
            }
        }
        return false;
    }
}