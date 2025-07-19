class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> list = new ArrayList<>();
        list.add(folder[0]);

        for(int i=1;i<folder.length;i++){
            String str = list.get(list.size()-1);
            str = str+"/";

            if(!folder[i].startsWith(str)){
                list.add(folder[i]);
            }
        }
        return list;
    }
}