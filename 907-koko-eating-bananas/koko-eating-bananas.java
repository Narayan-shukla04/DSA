class Solution {

    public static boolean eating(int[] piles, int h, int mid) {
        int total = 0;
        for (int pile : piles) {
            if (pile % mid == 0) {
                total += pile / mid;
            } else {
                total += (pile / mid) + 1;
            }

            if(total>h) return false;
        }
        
        return total <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int first = 1;
        int last = Integer.MIN_VALUE;
        for (int pile : piles) {
           
            last = Math.max(pile, last);
        }
        int ans = 0;

        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (eating(piles, h, mid)) {
                ans = mid;
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }

        return ans;
    }
}