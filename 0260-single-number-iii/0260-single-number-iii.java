class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }
        int[] arr = new int[set.size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = (new ArrayList<>(set)).get(i);
        }
        // List<Integer> list = new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(list.contains(nums[i])){
        //         list.remove(Integer.valueOf(nums[i]));
        //     }else{
        //         list.add(nums[i]);
        //     }
        // }
        // int[] arr = new int[list.size()];
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=list.get(i);
        // }
        return arr;
    }
}