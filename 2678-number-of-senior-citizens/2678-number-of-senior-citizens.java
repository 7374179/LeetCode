class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i=0;i<details.length;i++){
            int tmp = (details[i].charAt(details[i].length()-4)-'0')*10 + (details[i].charAt(details[i].length()-3)-'0');
            if(tmp>60){
                count++;
            }
        }
        return count;
    }
}