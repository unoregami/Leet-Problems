class Solution:
    def maxProduct(self, nums: list[int]) -> int:
        max = 0
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                current = (nums[i]-1)*(nums[j]-1)
                if max < current:
                    max = current
        return max