class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int index1 = -1;
        int index2 = -1;
        int result = Integer.MAX_VALUE;
        for(int i=0;i<wordsDict.length;i++){
            if(wordsDict[i].equals(word1)){
                index1 = i;
            }
            if(wordsDict[i].equals(word2)){
                index2 = i;
            }
            if(index1>=0 && index2>=0){
                result = Math.min(result, Math.abs(index1-index2));
            }
        }
        return result;
    }
}