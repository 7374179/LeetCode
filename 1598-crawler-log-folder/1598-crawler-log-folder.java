class Solution {
    public int minOperations(String[] logs) {
        int main = 0;
        String parent = "../";
        String remain = "./";
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals(parent)){
                if(main>0){
                    main--;
                }
            }else if(logs[i].equals(remain)){
                continue;
            }else{
                main++;
            }
        }
        return main;
    }
}