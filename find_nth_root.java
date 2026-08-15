package binary_search;

public class find_nth_root {

    class Solution {
    public int NthRoot(int n, int m) {
        int low = 1, high = m;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long power = power(mid, n); // compute mid^n safely

            if (power == m) return mid;
            else if (power > m) high = mid - 1;
            else low = mid + 1;
        }
        return -1; // floor of nth root
    }

    // helper to compute x^n safely using long
    private long power(int x, int n) {
        long ans = 1;
        for (int i = 0; i < n; i++) {
            ans *= x;
            if (ans > Integer.MAX_VALUE) break; // prevent overflow
        }
        return ans;
    }
}

    
}
