class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int max=Integer.MIN_VALUE;
        Arrays.sort(points, Comparator.comparingInt(a->a[0]));
        for(int i=0;i<points.length-1;i++){
            if(points[i+1][0]-points[i][0]>max){
                max=points[i+1][0]-points[i][0];
            }
        }
        return max;
    }
}