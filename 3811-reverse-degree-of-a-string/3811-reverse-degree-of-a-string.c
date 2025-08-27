int reverseDegree(char* s) {

    int ans= 0;
    for(int i=0; i<strlen(s); i++){
        ans+=(i+1)*(123-s[i]);
    }
    return ans;  
    
}