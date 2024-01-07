class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double dia=0;
        int maxArea = Integer.MIN_VALUE;
        double maxDia = Double.MIN_VALUE;
        for(int i=0;i<dimensions.length;i++){
            dia = Math.sqrt(Math.pow(dimensions[i][0], 2) + Math.pow(dimensions[i][1],2));
            if(dia>maxDia){
                maxDia=dia;                
                maxArea = dimensions[i][0]*dimensions[i][1];
            }else if(dia==maxDia){
                int area = dimensions[i][0]*dimensions[i][1];
                if(area>maxArea){
                    maxArea=area;
                }
            }
        }
        return maxArea;
    }
}