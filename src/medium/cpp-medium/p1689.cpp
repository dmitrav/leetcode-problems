
#include "p1689.h"

int getMinPartitions(std::string n){
    /* Runtime: 24 ms, faster than 98.75%
     * Memory Usage: 13.4 MB, less than 97.86% */

    int max = 0;

    for(char c: n){
        if (max < c-'0'){
            // this is how you get the value of char, not the ascii code
            max = c-'0';
        }
    }
    return max;
}
