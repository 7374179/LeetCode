class Solution {
    public String longestDiverseString(int a, int b, int c) {
        int curra = 0, currb = 0, currc = 0;
        int totalabc = a + b + c;
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<totalabc;i++){
            if((a>=b && a>=c && curra!=2) || (a>0 && (currb == 2 || currc == 2))){
                sb.append("a");
                a--;
                curra++;
                currb = 0;
                currc = 0;
            } else if((b>=a && b>=c && currb!=2) || (b>0 && (curra == 2||currc==2))){
                sb.append("b");
                b--;
                currb++;
                curra = 0;
                currc = 0;
            } else if((c>=a && c>=b && currc!=2) || (c>0 && (curra == 2||currb==2))){
                sb.append("c");
                c--;
                currc++;
                curra = 0;
                currb = 0;
            }
        }
        return sb.toString();
    }
}