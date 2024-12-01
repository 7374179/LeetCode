class Solution {
    public boolean checkIfExist(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
            if(arr[i]==0){
                count++;
            }
        }
        if(count>1){
            return true;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                continue;
            }
            if(list.contains(arr[i]*2)){
                return true;
            }
        }
        return false;
    }
}