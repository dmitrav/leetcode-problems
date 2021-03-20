#ifndef P1302_H
#define P1302_H

#include <vector>

/* A binary tree node has data, pointer to left child and a pointer to right child */
struct TreeNode
{
    int val;
    TreeNode* left, * right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}


};


TreeNode* insertLevelOrder(int arr[], TreeNode* root, int i, int n);
TreeNode* newNode(int data);
void inOrder(TreeNode* root);


int deepestLeavesSum(TreeNode* root);

#endif // P1302_H
