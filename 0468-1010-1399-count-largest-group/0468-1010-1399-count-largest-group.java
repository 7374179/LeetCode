class Solution {
    public int countLargestGroup(int n) {
        int max = 0;
        int count = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=1;i<=n;i++){
            String str = ""+i;
            int sum = 0;
            for(int j=0;j<str.length();j++){
                sum = sum + str.charAt(j)-'0';
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
                count = 1;
            } else if(entry.getValue() == max) {
                count++;
            }
        }
        return count;
    }
}