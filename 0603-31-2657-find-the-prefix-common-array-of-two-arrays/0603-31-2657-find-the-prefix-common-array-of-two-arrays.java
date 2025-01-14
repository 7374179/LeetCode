class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] arr = new int[A.length];
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<A.length;i++){
            list.add(A[i]);
            for(int j=0;j<=i;j++){
                if(list.contains(B[j])){
                    count++;
                }
                arr[i]=count;
            }
            count = 0;
        }
        return arr;
    }
}