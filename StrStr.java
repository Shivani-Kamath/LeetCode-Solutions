int strStr(char* haystack, char* needle) {
    int i,j,flag=0;
    int m=strlen(haystack);
    int n=strlen(needle);
    for(i=0;i<=m-n;i++){
        for(j=0;j<n;j++){
            if(haystack[i+j]!=needle[j]){
                break;
            }
        }
        if(j==n)
           return i;
    }
    return -1;
}