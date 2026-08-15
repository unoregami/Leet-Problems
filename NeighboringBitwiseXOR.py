class Solution:
    def doesValidArrayExist(self, derived: list[int]) -> bool:
        sum = 0
        for i in derived:
            sum += i

        if sum % 2 == 0:
            return True
