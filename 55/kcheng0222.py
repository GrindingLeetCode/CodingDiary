'''
9/12/2018
kcheng0222

Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.
'''

class Solution(object):
    def canJump(self, nums):
        farthest = 0
        for i, x in enumerate(nums):
            if farthest < i:
                return False
            farthest = max(farthest, i + x)
        return True
