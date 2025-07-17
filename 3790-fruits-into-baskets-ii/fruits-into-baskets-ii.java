class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int i = 0;
        int j = 0;
        int n1 = fruits.length;
        int n2 = baskets.length;
        int cnt = n2;
        while(i<n1 && j<n2){
            if(fruits[i] <= baskets[j]) {
                cnt--;
                baskets[j] = -1;
                i++;
                j = 0;
            } else if(j == n2-1){
                i++;
                j = 0;
            }else {
                j++;
            }
        }
        return cnt;
    }
}