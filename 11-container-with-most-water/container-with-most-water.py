class Solution:
    def maxArea(self, height: list[int]) -> int:
        start  = 0
        end = len(height)-1
        maxi = 0 
        while start < end :
            maxi = max(maxi, (end-start) * min(height[start], height[end]))

            if height[start] < height[end]:
                start += 1
            else:
                end -= 1
        
        return maxi