class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] filteredNums = Arrays.stream(nums).filter(n -> n > 0).toArray();
        
        Arrays.sort(filteredNums);
        
        int targe = 1;
        for (int n : filteredNums) {
            if (n == targe) {
                targe++;
            } else if (n > targe) {
                return targe;
            }
        }
        
        return targe;     
    }
}