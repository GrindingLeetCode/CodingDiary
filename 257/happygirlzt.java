/**
 * Created on 14 Sep 2018
 *
 * LeetCode #257. Binary Tree Paths
 */

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) return res;

        helper(root, "", res);
        return res;
    }

    public void helper(TreeNode root, String s, List<String> res) {
        // base case
        if (root.left == null && root.right == null) {
            s = s + root.val;
            res.add(s);
        } else {
            // choose
            s = s + root.val + "->";

            // explore
            if (root.left != null) {
                helper(root.left, s, res);
            }
            if (root.right != null) {
                helper(root.right, s, res);
            }

            // unchoose
            s = s.substring(0, s.length() - 1);
        }
    }
}
