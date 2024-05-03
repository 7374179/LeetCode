class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        Queue<Integer> que1 = new LinkedList<>();
        Queue<Integer> que2 = new LinkedList<>();

        for(int i=0;i<v1.length;i++){
            que1.add(Integer.parseInt(v1[i]));
        }
        for(int i=0;i<v2.length;i++){
            que2.add(Integer.parseInt(v2[i]));
        }

        while(!que1.isEmpty() && !que2.isEmpty()){
            int tmp1 = que1.poll();
            int tmp2 = que2.poll();
            if(tmp1 == tmp2){                
                if(que1.isEmpty() && que2.isEmpty()){
                    return 0;
                }
            }else if(tmp1>tmp2){
                return 1;
            }else if(tmp1<tmp2){
                return -1;
            }
        }
        if(!que1.isEmpty()){
            while(!que1.isEmpty()){
                if(que1.poll()>0){
                    return 1;
                }
            }
        }
        if(!que2.isEmpty()){
            while(!que2.isEmpty()){
                if(que2.poll()>0){
                    return -1;
                }
            }
        }
        return 0;
    }
}