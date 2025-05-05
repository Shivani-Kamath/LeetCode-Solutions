bool isPalindrome(int x) {
    unsigned int rem,pal=0,new;
    new=x;
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

    if(pal==new){
        return true;
    }
    return false;
   
    
}