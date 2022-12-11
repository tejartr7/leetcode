import numpy as np
class Solution(object):
    def deleteGreatestValue(self, grid):
        return sum([sorted(col,reverse=True)[0] for col in np.array([sorted(x,reverse=True) for x in grid]).T])