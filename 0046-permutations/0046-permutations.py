class Solution:
    def _init_(self):
        self.lst = []

    def helper(self, idx, nums):
        if idx >= len(nums):
            self.lst.append(nums[:])  # Copy the list and append it to the result
            return

        for i in range(idx, len(nums)):
            nums[idx], nums[i] = nums[i], nums[idx]  # Swap elements
            self.helper(idx + 1, nums)
            nums[idx], nums[i] = nums[i], nums[idx]  # Undo the swap

    def permute(self, nums):
        self.lst = []
        self.helper(0, nums)
        return self.lst