class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        idx = -1
        for i in range(len(nums) - 1, 0, -1):
            if nums[i] > nums[i - 1]:
                idx = i-1
                break
        if idx == -1:
            nums.sort()
        else:
            p = idx
            x=0
            for i in range(idx + 1, len(nums)):
                if nums[idx]<nums[i]: # Corrected condition
                    x = i
            t=nums[idx]
            nums[idx]=nums[x]
            nums[x]=t
            i=idx+1
            j=len(nums)-1
            while i<j:
                t=nums[i]
                nums[i]=nums[j]
                nums[j]=t
                i=i+1
                j=j-1
        return nums