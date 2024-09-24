class Solution {
    public String convertDateToBinary(String date) {
        String[] str = date.split("-");
        for(int i=0;i<str.length;i++){
            int tmp = Integer.parseInt(str[i]);
            str[i] = Integer.toBinaryString(tmp);
        }
        return str[0] + "-" + str[1] + "-" + str[2];
    }
}