class Solution {
    public int maximalSquare(char[][] matrix) {
        int[][] arr = new int[matrix.length][matrix[0].length];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                arr[i][j]=matrix[i][j]-'0';
            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[i].length;j++){
                if(arr[i-1][j-1]>0 && arr[i][j-1]>0 && arr[i-1][j]>0 && arr[i][j]>0){
                    int tmp = (int)Math.min(Math.sqrt(arr[i-1][j]), Math.min(Math.sqrt(arr[i-1][j-1]),Math.sqrt(arr[i][j-1])))+1;
                    arr[i][j]=(int)Math.pow(tmp,2);
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
}