'''
9/12/2018
kcheng0222@gmail.com

Assume you are an awesome parent and want to give your children some cookies.
But, you should give each child at most one cookie.
Each child i has a greed factor gi, which is the minimum size of a cookie that the child will be content with; and each cookie j has a size sj.
If sj >= gi, we can assign the cookie j to the child i, and the child i will be content.
Your goal is to maximize the number of your content children and output the maximum number.
'''

class Solution(object):
    def findContentChildren(self, g, s):

        g.sort()
        s.sort()
        childi = len(g) - 1
        cookiei = len(s) - 1
        
        ans = 0
        
        while childi >= 0 and cookiei >= 0:
            if g[childi] <= s[cookiei]:
                ans += 1
                childi -= 1
                cookiei -= 1
            else:
                childi -= 1
        return ans
