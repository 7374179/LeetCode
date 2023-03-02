void sort(char *s, int start, int end){
    // for(int i=0;i<strlen(s);i++){
    //     for(int j=i+1;j<strlen(s);j++){
    //         if(s[i]>s[j]){
    //             char tmp = s[i];
    //             s[i]=s[j];
    //             s[j]=tmp;
    //         }
    //     }
    // }
    if(start >= end){
        return;
    }
    int pl = start;
    int pr = end-1;
    char pivot = s[(pl+pr)/2];
    while(pl<=pr){
        while(s[pl]<pivot){
            pl++;
        }
        while(s[pr]>pivot){
            pr--;
        }
        if(pl<=pr){
            char tmp = s[pr];
            s[pr]=s[pl];
            s[pl]=tmp;
            pl++;
            pr--;
        }
    }

    sort(s, start, pr+1);
    sort(s, pl, end);
}

bool isAnagram(char * s, char * t){
    int len_t = strlen(t);
    int len_s = strlen(s);
    if(len_t != len_s) {
        return false;
    }    
    sort(s, 0, len_t);
    sort(t, 0, len_s);

    if(strcmp(s, t)==0){
        return true;
    }
    return false;
}