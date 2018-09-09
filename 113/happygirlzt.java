/**
 * Created on 8 Sep 2018
 * 113. Path Sum II
 *
 */

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        List<Integer> tmp = new ArrayList<>();
        helper(root, sum, tmp, res);

        return res;
    }

    public void helper(TreeNode root, int sum, List<Integer> tmp, List<List<Integer>> res) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            if (sum - root.val == 0) {
                tmp.add(root.val);
                res.add(new ArrayList<>(tmp));
                tmp.remove(tmp.size() - 1);
            } else {
                return;
            }
        }

        if (root.left != null) {
            tmp.add(root.val);
            helper(root.left, sum - root.val, tmp, res);
            tmp.remove(tmp.size() - 1);
        }

        if (root.right != null) {
            tmp.add(root.val);
            helper(root.right, sum - root.val, tmp, res);
            tmp.remove(tmp.size() - 1);
        }
    }
}
