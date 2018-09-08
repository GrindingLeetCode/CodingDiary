/**
 * Created on 8 Sep 20:32
 * 94. Binary Tree Inorder Traversal
*/
public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    if (root == null) return res;
    helper(root, res);
    return res;
}

public void helper(TreeNode root, List<Integer> res) {
    // Base case
    if (root == null) return;
    if (root.left != null) {
        helper(root.left, res);
    }

    res.add(root.val);

    if (root.right != null) {
        helper(root.right, res);
    }
}
