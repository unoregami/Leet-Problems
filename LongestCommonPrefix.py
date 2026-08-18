class Solution:
    def longestCommonPrefix(self, strs: list[str]) -> str:
        x = sorted(strs)
        f = x[0]
        l = x[-1]
        ans = ""
        for i in range(min(len(f), len(l))):
            if f[i] != l[i]:
                return ans
            ans+=f[i]
        return ans