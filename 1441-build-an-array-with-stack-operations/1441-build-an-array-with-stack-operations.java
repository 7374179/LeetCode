class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> str = new ArrayList<>();
        int i=0;
        int j=0;
        while(n>i && j<target.length){
            str.add("Push");
            if(i+1!=target[j]){
                str.add("Pop");
                i++;
            }else{
                i++;
                j++;
            }
        }
        return str;
    }
}