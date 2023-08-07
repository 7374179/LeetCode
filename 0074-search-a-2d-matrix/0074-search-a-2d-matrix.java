class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix[0].length-1;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(target>matrix[i][matrix[i].length-1]){
                    break;
                }else{
                    while(left<=right){
                        int mid=(left+right)/2;
                        if(target>matrix[i][mid]){
                            left=mid+1;
                        }else if(target<matrix[i][mid]){
                            right=mid-1;
                        }else{
                            return true;
                        }

                    }
                    
                }
            }
        }
        return false;
    }
}