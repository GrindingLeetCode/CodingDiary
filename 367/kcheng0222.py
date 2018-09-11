'''
Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

9/10/2018 kcheng0222
'''

class Solution(object):
    def isPerfectSquare(self, num):
        
        return (num **0.5).is_integer()
