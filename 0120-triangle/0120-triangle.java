// class Solution {
//     public int minimumTotal(List<List<Integer>> triangle) {
//         List<Integer> list = new ArrayList<>();
//         list.add(triangle.get(0).get(0));
//         int sum=triangle.get(0).get(0);
//         int min=Integer.MAX_VALUE;
        
//         for(int i=1;i<triangle.size();i++){
//             for(int j=0;j<triangle.get(i).size();j++){
//                 list.add(list.get(i-1).get(j)+triangle.get(i).get(j)));
//             }
//             sum=sum+min;
//             min=Integer.MAX_VALUE;
//         }

//         return sum;
//     }
// }

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int row = 1; row < triangle.size(); row++) {
            for (int col = 0; col <= row; col++) {
                int smallestAbove = Integer.MAX_VALUE;           
                if (col > 0) {
                    smallestAbove = triangle.get(row - 1).get(col - 1);
                } 
                if (col < row) {
                    smallestAbove = Math.min(smallestAbove, triangle.get(row - 1).get(col));
                }
                int path = smallestAbove + triangle.get(row).get(col);
                triangle.get(row).set(col, path);
            }
        }
        return Collections.min(triangle.get(triangle.size() - 1));
    }
}