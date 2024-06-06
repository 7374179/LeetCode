class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0){
            return false;
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<hand.length;i++){
            list.add(hand[i]);
        }
        int start = Collections.min(list);
        int count = 0;
        int i = 0;
        int num = 0;
        while(i<hand.length){
            if(count==groupSize){
                count = 0;
                start = Collections.min(list);
                num = 0;
            }
            if(list.contains(start+num)){
                count++;
                list.remove(Integer.valueOf(start+num));
                num++;
            }else{
                return false;
            }
            i++;

        }
        return true;
    }
}