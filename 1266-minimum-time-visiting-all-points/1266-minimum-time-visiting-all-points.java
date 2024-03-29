class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int max=0;
        for(int i=1;i<points.length;i++){
            max = max + Math.max(Math.abs(points[i-1][0]-points[i][0]), Math.abs(points[i-1][1]-points[i][1]));
        }
        return max;
    }
}