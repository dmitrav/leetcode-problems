
#include "p1302.h"
#include <iostream>
#include <queue>

using namespace std;

/* Helper function that allocates a new node */
TreeNode* newNode(int data)
{
    TreeNode* node = (TreeNode*)malloc(sizeof(TreeNode));
    node->val = data;
    node->left = node->right = NULL;
    return (node);
}

// Function to insert nodes in level order
TreeNode* insertLevelOrder(int arr[], TreeNode* root, int i, int n)
{
    // Base case for recursion
    if (i < n)
    {
        TreeNode* temp = newNode(arr[i]);
        root = temp;

        // insert left child
        root->left = insertLevelOrder(arr, root->left, 2 * i + 1, n);

        // insert right child
        root->right = insertLevelOrder(arr, root->right, 2 * i + 2, n);
    }
    return root;
}

// Function to print tree nodes in InOrder fashion
void inOrder(TreeNode* root)
{
    if (root != NULL)
    {
        inOrder(root->left);
        cout << root->val <<" ";
        inOrder(root->right);
    }
    cout << endl;
}


// for solution
int deepestLeavesSum(TreeNode* root){

    int res = 0, i;
    queue<TreeNode*> q;
    q.push(root);
    while (q.size()) {
        for (i = q.size() - 1, res = 0; i >= 0; --i) {
            TreeNode* node = q.front(); q.pop();
            res += node->val;
            if (node->right) q.push(node->right);
            if (node->left)  q.push(node->left);
        }
    }

    return res;
}
