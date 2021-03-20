#include <iostream>
#include <vector>
#include "p1302.h"

using namespace std;



int main()
{

//    int input[] = {1, 2, 3, 4, 5, NULL, 6, 7, NULL, NULL, NULL, NULL, 8};
    int input[] = {6, 7, 8, 2, 7, 1, 3, 9, NULL, 1, 4, NULL, NULL, NULL, 5};

    int n = sizeof(input) / sizeof(input[0]);

    TreeNode* root = insertLevelOrder(input, root, 0, n);

//    inOrder(root);

    cout << deepestLeavesSum(root) << endl;


    return 0;
}
