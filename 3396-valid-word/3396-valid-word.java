class Solution {
    public boolean isValid(String word) {
        boolean len = false;
        boolean vow = false;
        boolean con = false;
        if(word.length()<3) {
            return false;
        } else {
            len = true;
        }

        List<Character> list1 = new ArrayList<>(List.of('a', 'e', 'i', 'o', 'u'));
        List<Character> list2 = new ArrayList<>(List.of('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'));
        List<Character> list3 = new ArrayList<>(List.of('1', '2', '3', '4', '5', '6', '7', '8', '9', '0'));

        for(int i=0;i<word.length();i++){
            if(list1.contains(Character.toLowerCase(word.charAt(i)))){
                vow = true;
            } else if(list2.contains(Character.toLowerCase(word.charAt(i)))){
                con = true;
            } else if(list3.contains(word.charAt(i))){
                continue;
            } else {
                return false;
            }
        }
        return len & vow & con;
    }
}