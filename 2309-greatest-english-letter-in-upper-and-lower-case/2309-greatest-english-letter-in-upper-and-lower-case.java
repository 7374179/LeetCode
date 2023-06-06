class Solution {
    public String greatestLetter(String s) {
        String str = "";
        char tmp = ' ';
        char ch = ' ';
        Set<Character> set = new HashSet<Character>();

        set.add(s.charAt(0));            
        

        for(int i=1;i<s.length();i++){
            
            tmp=s.charAt(i);
            if('a'<=tmp && tmp<='z'){
                tmp=Character.toUpperCase(tmp);
            }else{
                tmp=Character.toLowerCase(tmp);
            }


            if(set.contains(tmp)){
                if(Character.toUpperCase(tmp)>Character.toUpperCase(ch)){
                    ch=tmp;
                }
            }
            set.add(s.charAt(i));
        }
        str=String.valueOf(Character.toUpperCase(ch));
        if(str.equals(" ")){
            str="";
        }
        return str;
    }
}