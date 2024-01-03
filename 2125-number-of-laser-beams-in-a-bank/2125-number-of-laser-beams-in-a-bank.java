class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[bank.length];
        int sum=0;

        for(int i=0;i<bank.length;i++){
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    arr[i]++;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                list.add(arr[i]);
            }
        }

        for(int i=0;i<list.size()-1;i++){
            sum=sum+list.get(i)*list.get(i+1);
        }

        return sum;
    }
}