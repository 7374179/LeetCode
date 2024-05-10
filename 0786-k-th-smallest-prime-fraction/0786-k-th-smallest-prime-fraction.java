class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        List<Double> list = new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                list.add((double)arr[i]/arr[j]);
            }
        }
        Collections.sort(list);
        int num = 0;
        int[] ans = new int[2];
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if((double)arr[i]/arr[j] == list.get(k-1)){
                    ans[0] = arr[i];
                    ans[1] = arr[j];
                }
            }
        }
        return ans;
    }
}