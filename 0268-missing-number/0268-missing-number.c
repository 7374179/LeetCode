int missingNumber(int* nums, int numsSize){
    int tmp=0;
    int count=0;
    for(int i=0;i<numsSize-1;i++){
        for(int j=i+1;j<numsSize;j++){
            if(nums[i]>nums[j]){
                int tmp = nums[i];
                nums[i]=nums[j];
                nums[j]=tmp;
            }
        }
    }
    if(numsSize==1&&nums[0]==0){
        return 1;
    }else if(numsSize==1&&nums[0]==1){
        return 0;
    }

    for(int i=1;i<numsSize;i++){
        if(nums[i]-nums[i-1]!=1){
            tmp=nums[i-1]+1;
            count++;
            return tmp;
        }else{
            count++;
            if(count+1==numsSize){
                if(nums[0]==0){
                    tmp=numsSize;
                }else{
                    tmp=0;
                }
            }
        }
    }
    return tmp;
}