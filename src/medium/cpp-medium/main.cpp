#include <iostream>
#include <vector>
#include "p1282.h"

using namespace std;


int main()
{

    vector<int> groupSizes = {3,3,3,3,3,1,3};

    vector<vector<int>> res = groupThePeople(groupSizes);
    printGroups(res);

    return 0;
}
