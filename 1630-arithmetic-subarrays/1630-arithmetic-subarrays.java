class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<l.length){
            List<Integer> sub = new ArrayList<>();
            int a = l[i];
            int b = r[j];
            for(int x=a;x<=b;x++){
                tmp.add(nums[x]);
            }
            i++;
            j++;

            Collections.sort(tmp);
            int diff = tmp.get(1)-tmp.get(0);
            for(int k=0;k<tmp.size()-1;k++){
                if(tmp.get(k)+diff!=tmp.get(k+1)){
                    list.add(false);
                    break;
                } else if(k+1==tmp.size()-1){
                    list.add(true);
                }
            }
            tmp.clear();
        }


        return list;
    }
}