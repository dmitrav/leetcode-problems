
#include "p1769.h"
#include <string>
#include <vector>

// leetcode 1769: Minimum Number of Operations to Move All Balls to Each Box
int* getMinNumberOfOperations(std::string input){

    int* res = new int[input.size()];
    for (int i=0; i < input.size(); i++){
        *(res+i) = 0;
    }

    for (int i=0; i<input.size(); i++){

        for (int j=0; j < input.size(); j++){

            if (i != j && input.at(j) == '1'){
                // if there's a ball in the j-th box
                if (i < j){
                    res[i] += j-i;
                } else {
                    res[i] += i-j;
                }

            }
        }
    }

    return res;
}

std::vector<int> getVectorOfMinNumberOfOperations(std::string input){
    /* Runtime: 420 ms, faster than 25.00%
    Memory Usage: 9.2 MB, less than 50.00% */

    std::vector<int> res;
    for (int i=0; i < input.size(); i++){
        res.push_back(0);
    }

    for (int i=0; i < input.size(); i++){

        for (int j=0; j < input.size(); j++){

            if (i != j && input.at(j) == '1'){
                // if there's a ball in the j-th box
                if (i < j){
                    res[i] += j-i;
                } else {
                    res[i] += i-j;
                }

            }
        }
    }
    return res;

}


std::vector<int> getVectorOfMinNumberOfOperations_2(std::string input){
    /* */

    std::vector<int> res;

    for (int i=0; i < input.size(); i++){

        int sum = 0;
        for (int j=0; j < input.size(); j++){

            if (i != j && input.at(j) == '1'){
                // if there's a ball in the j-th box
                if (i < j){
                    sum += j-i;
                } else {
                    sum += i-j;
                }

            }
        }
        res.push_back(sum);
    }

    return res;

}



