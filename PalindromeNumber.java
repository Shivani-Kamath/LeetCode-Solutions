class Solution {
    public boolean isPalindrome(int x) {
    int rem,pal=0,n;
    n=x;
    if(x==0){
        return true;
    }
    if(x<0 || x%10==0){
        return false;
    }
    while(x>0){
    rem=x%10;
    x=x/10;
    pal= pal*10 + rem;
    }

    if(pal==n){
        return true;
    }
    return false;
        
    }
}