public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> inorder = new ArrayList<Integer>();

    if(root == null)
        return inorder;

    traverser(root, inorder);

    return inorder;
}


public void traverser(TreeNode root, List<Integer> inorder){
    if (root == null)
        return;

    if(root.left != null)
        traverser(root.left, inorder);

    inorder.add(root.val);

    if(root.right != null)
        traverser(root.right, inorder);
}
