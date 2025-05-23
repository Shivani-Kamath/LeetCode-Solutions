class Solution {
    public double myPow(double x, int n) {
        double res=1;
        if(n==0) return 1;
        if(n==Integer.MIN_VALUE){
            return 1/(x*myPow(x,-(n+1)));
        }
        if(n<0){
            n=n*-1;
            x=1/x;
        }
        if(n%2==0){
            return myPow(x*x,n/2);
        }
        else {
        return x*myPow(x*x,n/2);
    }
    }
}