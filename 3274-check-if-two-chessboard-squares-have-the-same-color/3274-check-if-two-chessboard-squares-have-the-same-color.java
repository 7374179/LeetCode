class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        if((coordinate1.charAt(0)-'a')%2 == (coordinate2.charAt(0)-'a')%2){
            if((coordinate1.charAt(1)-'0')%2 == (coordinate2.charAt(1)-'0')%2){
                return true;
            }
        }else{
            if((coordinate1.charAt(1)-'0')%2 != (coordinate2.charAt(1)-'0')%2){
                return true;
            }
        }        
        return false;
    }
}