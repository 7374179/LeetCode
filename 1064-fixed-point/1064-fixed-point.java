class Solution {
    public int fixedPoint(int[] arr) {
    //     int left =0;
    //     int right = arr.length-1;
    //     int mid = (left+right)/2;

    //     for(int i=0;i<right;i++){
    //         if(arr[i]==i){
    //             return i;
    //         }
    //     }    
    // return -1;
    int left =0;
    int right = arr.length-1;
    int answer = -1;
    while(left<=right){
        int mid=(left+right)/2;
        if(arr[mid]==mid){
            answer = mid;
            right = mid-1;
        }else if(arr[mid]<mid){
            left=mid+1;
        }else{
            right=mid-1;
        }
    }
    return answer;

    }
}