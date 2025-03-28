class Solution {
    public boolean phonePrefix(String[] numbers) {
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                if(i==j){
                    continue;
                }
                if(numbers[i].indexOf(numbers[j])==0){
                    return false;
                }
            }
        }
        return true;
    }
}