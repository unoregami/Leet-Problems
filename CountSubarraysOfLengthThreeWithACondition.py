class Solution:
    def countSubarrays(self, nums: list[int]) -> int:
        output = 0
        for i in range(len(nums)-2):
            num, half = nums[i+1], nums[i]+nums[i+2]
            if half * 2 == num:
                output += 1
            
        return output