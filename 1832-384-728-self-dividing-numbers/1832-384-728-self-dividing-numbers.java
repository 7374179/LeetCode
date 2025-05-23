class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i=left; i<=right; i++){
            String str = i + "";
            for(int j=0;j<str.length();j++){
                int tmp = str.charAt(j)-'0';
                if(tmp==0 || i%tmp!=0){
                    break;
                }
                if(j==str.length()-1){
                    list.add(i);
                }
            }
        }
        return list;
    }
}