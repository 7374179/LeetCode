class Solution {
    public void setZeroes(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    for(int a=0;a<matrix[i].length;a++){
                        if(matrix[i][a]!=0){
                            matrix[i][a]=5555555;
                        }
                    }
                    for(int b=0;b<matrix.length;b++){
                        if(matrix[b][j]!=0){
                            matrix[b][j]=5555555;
                        }
                    }
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0||matrix[i][j]==5555555){
                    matrix[i][j]=0;
                }
            }
        }

    }
}