'''
 Created on 8 Sep
 94. Binary Tree Inorder Traversal
'''

#I'm still learning about binary trees, so solution is quite similar to solution on "Discuss".

class Solution(object):
    def hasPathSum(self, root, sum):
        if not root:
            return False
        
        if not root.left and not root.right and root.val == sum:
            return True
        
        sum -= root.val
        
        return self.hasPathSum(root.left, sum) or self.hasPathSum(root.right, sum)
