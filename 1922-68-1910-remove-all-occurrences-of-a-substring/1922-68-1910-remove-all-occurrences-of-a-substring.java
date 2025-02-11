class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        int len = part.length();
        while(true){
            int tmp = sb.indexOf(part);
            if(tmp<0){
                break;
            }
            sb.delete(tmp, tmp+len);            
        }
        return sb.toString();
    }
}