class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int tmpi=0;
        int tmpj=0;
        int i=0;
        int j=0;
        int row = matrix.length-1;
        int col = matrix[0].length-1;
        int num=1;
    

        while(list.size()<(matrix.length)*(matrix[0].length)){
            switch(num){
                case(1):
                list.add(matrix[i][j]);
                j++;
                if(j==col+1){
                    num=2;
                    tmpi++;
                    j--;
                    i++;
                }
                break;
                case(2):
                list.add(matrix[i][j]);
                i++;
                if(i==row+1){
                    num=3;
                    col--;
                    i--;
                    j--;
                }
                break;
                case(3):
                list.add(matrix[i][j]);
                j--;
                if(j==tmpj-1){
                    num=4;
                    row--;
                    j++;
                    i--;
                }
                break;
                case(4):
                list.add(matrix[i][j]);
                i--;
                if(i==tmpi-1){
                    num=1;
                    tmpj++;
                    i++;
                    j++;
                }
                break;
            }

        }

        return list;
    }
}