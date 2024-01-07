class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        if(Math.abs(c-e)==Math.abs(d-f)){
            if(Math.abs(c-a)!=Math.abs(d-b)){
                return 1;
            }
            else if(a>c&&b<d&&a<e&&b>f || a<c&&b<d&&a>e&&b>f || a<c&&b>d&&a>e&&b<f || a>c&&b>d&&a<e&&b<f){
                return 2;  
            }else{
                return 1;
            }
        }else if(a==e || b==f){
            if(a==c&&b<d&&a==e&&d<f||a==c&&b>d&&a==e&&d>f||b==d&&a<c&&b==f&&c<e||b==d&&a>c&&b==f&&c>e){
                return 2;
            }else{
                return 1;
            }
        }
        return 2;
    }
}
