class Solution {
    public boolean judgeCircle(String moves) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<moves.length();i++){
            map.put(moves.charAt(i), map.getOrDefault(moves.charAt(i), 0)+1);
        }
        int[] arr = new int[4];
        arr[0] = map.getOrDefault('R', 0);
        arr[1] = map.getOrDefault('L', 0);
        arr[2] = map.getOrDefault('U', 0);
        arr[3] = map.getOrDefault('D', 0);
        return arr[0]-arr[1]==0 && arr[2]-arr[3] == 0;
    }
}