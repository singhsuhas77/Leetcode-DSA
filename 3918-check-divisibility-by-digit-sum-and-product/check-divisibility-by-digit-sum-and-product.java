class Solution {
    public boolean checkDivisibility(int n) {
        int a=0, s=0,p=1,b=n;
        while(n>0){
            a=n%10;
            s=s+a;
            p=p*a;
            n=n/10;
        }
        if(b%(s+p)==0) return true;
        else return false;
    }
}