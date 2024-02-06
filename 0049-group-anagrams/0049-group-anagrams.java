class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        String[][] arr = new String[strs.length][2];
        for(int i=0;i<strs.length;i++){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            arr[i][0] = new String(charArray);
            arr[i][1] = ""+i;
        }
        int left=0;
        int curr=left+1;
        while(curr<=strs.length){
            List<String> tmp = new ArrayList<>();
            if(!strs[left].equals("!!")){
                tmp.add(strs[left]);
            }else{
                left++;
                curr=left+1;
                continue;
            }
            for(int i=curr;i<strs.length;i++){
                if(arr[left][0].equals(arr[i][0])){
                    tmp.add(strs[i]);
                    strs[i]="!!";
                }
            }
            left++;
            curr=left+1;
            list.add(tmp);
        }
        return list;
    }
}