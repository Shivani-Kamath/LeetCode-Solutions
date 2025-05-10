class Solution {
    public int strStr(String haystack, String needle) {
    int i,j,flag=0;
    int m=haystack.length();
    int n=needle.length();
    for(i=0;i<=m-n;i++){
        for(j=0;j<n;j++){
            if(haystack.charAt(i+j)!=needle.charAt(j)){
                break;
            }
        }
        if(j==n)
           return i;
    }
    return -1;  
    }
}