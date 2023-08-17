class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] arr = new int[spells.length];
        int count=0;
        int left=0;
        int right = potions.length-1;

        for(int i=0;i<spells.length;i++){            
            while(left<=right){
                int mid = (left+right)/2;
                double tmp = (double)success/spells[i];
                if(potions[mid]>=tmp){
                    right=mid-1;
                }else if(potions[mid]<tmp){
                    left=mid+1;
                }
            }
            arr[i]=potions.length-left;
            left=0;
            right=potions.length-1;
        }
        return arr;

    }
}