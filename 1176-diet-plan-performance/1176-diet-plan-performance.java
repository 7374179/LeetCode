class Solution {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int[] arr = new int[calories.length+1];
        int count=0;
        int j=0;

        for(int i=1;i<=calories.length;i++){
            arr[i]=arr[i-1]+calories[i-1];
        }

        for(int i=k;i<=calories.length;i++){
            if(arr[i]-arr[j]<lower){
                count--;
            }else if(arr[i]-arr[j]>upper){
                count++;
            }
            j++;
        }
        return count;
    }
}