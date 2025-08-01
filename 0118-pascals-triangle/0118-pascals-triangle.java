class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list.add(new ArrayList<>());
        list.get(0).add(1);

        for(int i=1;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            List<Integer> prev = new ArrayList(list.get(i-1));

            row.add(1);

            for(int j=1;j<i;j++){
                row.add(prev.get(j-1)+prev.get(j));
            }

            row.add(1);

            list.add(row);
        }
        return list;        
    }
}

// 정답! 나중에 다시 풀어보기!!