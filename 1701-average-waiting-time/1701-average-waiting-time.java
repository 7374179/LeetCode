class Solution {
    public double averageWaitingTime(int[][] customers) {
        double sum = customers[0][1];
        int last = customers[0][0]+customers[0][1];
        int tmp = 0;
        for(int i=1;i<customers.length;i++){
            // last = customers[i][0]+customers[i][0];
            if(last>customers[i][0]){
                tmp = last+customers[i][1];
            }else{
                tmp = customers[i][0]+customers[i][1];
            }
            sum = sum +(tmp-customers[i][0]);
            last = tmp;
        }
        return sum/customers.length;
    }
}