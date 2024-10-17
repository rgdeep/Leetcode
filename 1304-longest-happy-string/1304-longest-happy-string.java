class Solution {
    public String longestDiverseString(int a, int b, int c) {
        int maxLen=a+b+c;
        int ca=0,cb=0,cc=0;
        StringBuilder s= new StringBuilder();
        for(int i=0;i<maxLen;i++){
            if(( a>=b && a>=c && ca!=2 )||(cb==2 && a>0)||(cc==2 && a>0)){
                s.append("a");
                a=a-1;
                ca=ca+1;
                cc=0;
                cb=0;
            }
                else if(( b>=a && b>=c && cb!=2 )||(ca==2 && b>0)||(cc==2 && b>0)){
                s.append("b");
                b=b-1;
                cb=cb+1;
                cc=0;
                ca=0;
            }
                else if(( c>=b && c>=a && cc!=2 )||(cb==2 && c>0)||(ca==2 && c>0)){
                s.append("c");
                c=c-1;
                cc=cc+1;
                ca=0;
                cb=0;
            }
            else{
                break;
            }
        }
        return s.toString();
    }
}