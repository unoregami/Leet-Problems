class Solution:
    def shiftGrid(self, grid: list[list[int]], k: int) -> list[list[int]]:
        straight_list = []
        
        for i in grid:
            straight_list += i
        if k >= len(straight_list):
            k = k % len(straight_list)
        k *= -1
        output = []
        for i in range(len(grid)):
            ph = []
            for j in range(len(grid[0])):
                ph.append(straight_list[k])
                k += 1
            output.append(ph)
        return output