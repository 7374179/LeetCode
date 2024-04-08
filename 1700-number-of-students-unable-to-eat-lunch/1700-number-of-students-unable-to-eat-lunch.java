class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> stu = new LinkedList<>();
        Queue<Integer> sand = new LinkedList<>();
        int len = students.length;
        int count = 0;
        for(int i:students){
            stu.add(i);
        }
        for(int i:sandwiches){
            sand.add(i);
        }

        while(!stu.isEmpty()){
            if(stu.peek()==sand.peek()){
                stu.poll();
                sand.poll();
                len--;
                count=0;
            }else{
                stu.add(stu.poll());
                count++;
            }
            if(count==len){
                return stu.size();
            }
        }
        return stu.size();
    }
}