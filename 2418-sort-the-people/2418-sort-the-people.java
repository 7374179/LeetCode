class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] str = new String[names.length];
        int[][] arr = new int[names.length][2];
        for(int i=0;i<names.length;i++){
            arr[i][0] = i;
            arr[i][1] = heights[i];
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(b[1], a[1]));

        for(int i=0;i<names.length;i++){
            str[i] = names[arr[i][0]];
        }
        return str;
    }
}