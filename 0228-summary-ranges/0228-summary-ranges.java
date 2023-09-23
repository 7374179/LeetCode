class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int i=1;
        if(nums.length==1){
            list.add(nums[0]+"");
            return list;
        }
        while(i<=nums.length){
            if(i==nums.length){
                if(nums[i-2]+1!=nums[i-1]){
                    list.add(nums[i-1]+"");                    
                    break;
                }            
                break;
            } 
            if(nums[i-1]+1!=nums[i]){
                list.add(nums[i-1]+"");
            }else{
                for(int j=i+1;j<=nums.length;j++){
                    if(j==nums.length){
                        list.add(nums[i-1]+"->"+nums[j-1]);
                        i=j;
                        break;
                    }
                    if(nums[j-1]+1==nums[j]){
                        continue;
                    }else{
                        list.add(nums[i-1]+"->"+nums[j-1]);
                        i=j;
                        break;
                    }
                }                
            }
            i++;
        }
        
        return list;
    }
}