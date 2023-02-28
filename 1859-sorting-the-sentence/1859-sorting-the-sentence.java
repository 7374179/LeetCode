class Solution {
    public String sortSentence(String s) {
        String[] tmp = new String[9];
        int count=0;
        char[] sort = s.toCharArray();
        String temp = "";
        for(int i=0;i<sort.length;i++){
            if(sort[i]==' '){
                continue;
            }
            temp=temp+sort[i];
            if('0'<=sort[i]&&sort[i]<='9'){
                tmp[count++]=temp;
                temp="";
            }
        }

        temp="";
        for(int i=0;i<tmp.length-1;i++){
            for(int j=i+1;j<tmp.length;j++){
                if(tmp[i]==null||tmp[j]==null){
                    continue;                    
                }else{
                    if(tmp[i].charAt(tmp[i].length()-1)>tmp[j].charAt(tmp[j].length()-1)){
                        String chg = tmp[i];
                        tmp[i] = tmp[j];
                        tmp[j]=chg;
                    }
                }
            }
        }

        temp="";
        for(int i=0;i<tmp.length&&tmp[i]!=null;i++){
            for(int j=0;j<tmp[i].length();j++){
                if('0'<=tmp[i].charAt(j)&&tmp[i].charAt(j)<='9'){
                    temp=temp+' ';
                }else{
                    temp=temp+tmp[i].charAt(j);
                }
            }
        }

        String pls ="";
        for(int i=0;i<temp.length()-1;i++){
            pls = pls+temp.charAt(i); 
        }
        return pls;
    }
}