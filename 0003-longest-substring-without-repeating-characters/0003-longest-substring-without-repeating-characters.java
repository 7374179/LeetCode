public class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList<>();
        int count=0;
        int max = Integer.MIN_VALUE;

        int left=0;
        int curr=0;
        if(s.length()==0){
            return 0;
        }else if(s.length()==1){
            return 1;
        }

        while(left<s.length()&&curr<s.length()){
            if(list.contains(s.charAt(curr))){
                list.remove(0);
                left++;
                if(count>max){
                    max=count;
                }
                count--;
            }else{
                list.add(s.charAt(curr));
                curr++;
                count++;
            }
        }
        if(max<count){
            return count;
        }
        return max;
    }
}