class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int[] arrMin = new int[matrix.length];
        int[] arrMax = new int[matrix[0].length];

        List<Integer> minList = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                    arrMin[i] = min;
                }
            }
            min = Integer.MAX_VALUE;
        }

        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][i]>max){
                    max = matrix[j][i];
                    arrMax[i] = max;
                }
            }
            max = Integer.MIN_VALUE;
        }

        for(int i=0;i<arrMin.length;i++){
            minList.add(arrMin[i]);
        }

        for(int i=0;i<arrMax.length;i++){
            if(minList.contains(arrMax[i])){
                list.add(arrMax[i]);
            }
        }

        return list;
    }
}