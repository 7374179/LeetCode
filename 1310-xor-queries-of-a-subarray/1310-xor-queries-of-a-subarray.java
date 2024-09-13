class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] newArr = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int a = queries[i][0];
            int b = queries[i][1];
            int sum = 0;
            for(int j=a;j<=b;j++){
                sum = sum^arr[j];
            }
            newArr[i] = sum;
        }
        return newArr;
    }
}