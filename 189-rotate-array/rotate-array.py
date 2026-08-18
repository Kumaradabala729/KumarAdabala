class Solution:
    def rotate(self, nums: list[int], k: int) -> None:
        n = len(nums)
        if n == 0:
            return 
        k = k%n

        self.reverse(nums,0,n-1)
        self.reverse(nums,0,k-1)
        self.reverse(nums,k,n-1)

    def reverse(self,nums,left,right):
        while left<right:
            nums[left],nums[right] = nums[right],nums[left]
            left = left+1
            right = right-1
        return nums            
        