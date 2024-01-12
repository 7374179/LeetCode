class Solution {
    public boolean halvesAreAlike(String s) {
        List<Character> list = new ArrayList<>();
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        for(char ch : vowels){
            list.add(ch);
        }

        int countA=0;
        int countB=0;
        
        for(int i=0;i<s.length();i++){
            if(i<s.length()/2){
                if(list.contains(s.charAt(i))){
                    countA++;
                }
            }else{
                if(list.contains(s.charAt(i))){
                    countB++;
                }
            }
        }

        return countA==countB;
    }
}