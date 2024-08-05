class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        int num = k-1;
        String res = "";
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for(int i=0;i<arr.length;i++){
            String str = arr[i];
            if(map.get(str)==1){
                if(num==0){
                    res = arr[i];
                }
                num--;
            }
        }
        return res;
    }
}