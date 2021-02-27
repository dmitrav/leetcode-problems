#include <iostream>
#include "problem1769.h"

using namespace std;

int main()
{
    string s = "001011";

//    int* res = getMinNumberOfOperations(s);
//    std::vector<int> res = getVectorOfMinNumberOfOperations(s);
    std::vector<int> res = getVectorOfMinNumberOfOperations_2(s);

    for (int i=0; i < s.size(); i++){
        cout << res[i] << " ";
    }
    cout << endl;

    return 0;
}
