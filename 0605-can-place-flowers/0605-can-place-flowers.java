class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0){
            return true;
        }
        int p = n;
        if(flowerbed.length==1 && flowerbed[0]==0){
            return true;
        }
        if(flowerbed[0]==0 && flowerbed[1]==0){
            flowerbed[0]=1;
            p--;
        } 
        if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0){
            flowerbed[flowerbed.length-1]=1;
            p--;
        }
        
        for(int i=1;i<flowerbed.length-1;i++){
            if(flowerbed[i]==1){
                continue;
            }else{
                if(flowerbed[i-1]==1||flowerbed[i+1]==1){
                    continue;
                }else{
                    p--;
                    flowerbed[i]=1;
                    if(p==0){
                        return true;
                    }
                }
            }
        }
        return p==0 || p<0;
    }
}