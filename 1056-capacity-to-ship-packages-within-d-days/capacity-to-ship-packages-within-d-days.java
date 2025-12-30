class Solution {

    public static boolean isValid(int []weights, int days, int capacity) {
        int sum = 0, count = 1;
        for (int arr : weights) {
            if (sum + arr > capacity) {
                count++;
                sum = arr;

            } else {
                sum += arr;
            }
        }
        return count <= days;

    }

    public int shipWithinDays(int[] weights, int days) {
        if (days > weights.length)
            return -1;
        int start = 0, end = 0;
        for (int arr : weights) {
            end += arr;
            start = Math.max(start, arr);
        }
        int ans = -1;
        while (start <= end) {
           int  mid = start + (end - start) / 2;
            if (isValid(weights, days, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
}