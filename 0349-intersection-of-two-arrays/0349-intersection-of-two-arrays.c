/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
void sort(int *nums, int numsSize){
    for(int i=0;i<numsSize-1;i++){
        for(int j=i+1;j<numsSize;j++){
            if(nums[i]>nums[j]){
                int tmp=nums[i];
                nums[i]=nums[j];
                nums[j]=tmp;
            }
        }
    }
}

void remover(int *nums, int numsSize){
    int tmp[numsSize];
    int count=0;
    for(int i=1;i<numsSize;i++){
        if(nums[i-1]!=nums[i]){
            tmp[count++]=nums[i-1];
        }
    }
    if(nums[numsSize-2]!=nums[numsSize-1]){
        tmp[count++]=nums[numsSize-1];
    }
    strcpy(nums, tmp);
}

int* intersection(int* nums1, int nums1Size, int* nums2, int nums2Size, int* returnSize){
    int tmp[1000]={0};
    int *inter = malloc(sizeof(int)*1000);
    int count=0;

    // sort(nums1, nums1Size);
    // sort(nums2, nums2Size);
    // remover(nums1, nums1Size);
    // remover(nums2, nums2Size);
    

    for(int i=0;i<nums1Size;i++){
        tmp[nums1[i]]=1;
    }
    // for(int j=0;j<nums2Size;j++){
    //     tmp[nums2[j]]=1;
    // }

    for(int i=0;i<nums2Size;i++){
        if(tmp[nums2[i]]==1){
            inter[count++]=nums2[i];
            tmp[nums2[i]]=0;
        }
    }
    
    *returnSize=count;
    return inter;
}

// int* intersection(int* nums1, int nums1Size, int* nums2, int nums2Size,
//                   int* returnSize) {
//   int* map = malloc(sizeof(int) * 1000);
//   int* res = malloc(sizeof(int) * 1000);
//   int cnt = 0;

//   for (int i = 0; i < nums1Size; i++) {
//     map[nums1[i]] = 1;
//   }
//   for (int i = 0; i < nums2Size; i++) {
//     if (map[nums2[i]] == 1) {
//       res[cnt++] = nums2[i];
//       map[nums2[i]] = 0;
//     }
//   }
//   *returnSize = cnt;
//   return res;
// }