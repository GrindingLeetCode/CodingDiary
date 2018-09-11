public boolean hasPathSum(TreeNode root, int sum) {
    if(root == null)
        return false;

    if(root.left == null && root.right == null) // check leaf
    {
        if(sum == root.val)  // value check
            return true;
        else
            return false;
    }

    if(hasPathSum(root.left, sum - root.val))
        return true;
    if(hasPathSum(root.right, sum-root.val))
        return true;

    return false;
}
