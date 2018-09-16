class Solution {
public:
  vector<int> inorderTraversal(TreeNode* root) {
    std::stack<TreeNode *> nodeStack;
    std::vector<int> target;

    while (root != nullptr) {
      while (root != nullptr) {
        nodeStack.push(root);
        root = root->left;
      }

      // find the first right sub-tree in the stack
      // And maintain the invariant(by poping and pushing)
      while (root == nullptr && !nodeStack.empty()) {
        root = nodeStack.top();
        nodeStack.pop();
        target.emplace_back(root->val);
        root = root->right;
      }

      // if no node is found, end iteration
      // if found, begin searching in left tree first
      // maintaining the invariant with stack
    }
    return target;
  }
};
