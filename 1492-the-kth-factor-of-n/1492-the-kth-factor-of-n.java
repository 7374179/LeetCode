class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> list = new ArrayList<>();
        int i=1;
        while(n>=i){
            if(n%i==0){
                list.add(i);
            }
            i++;
        }
        if(list.size()<k){
            return -1;
        }else{
            return list.get(k-1);
        }
    }
}