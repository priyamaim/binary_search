package binary_search;

public class koko_eating_bananas {

    class Solution {
    public int minimumRateToEatBananas(int[] nums, int h){

        int low = 1;
        int high = 0;

        for (int x : nums) {
            high = Math.max(high, x);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long hours = 0;

            for (int x : nums) {
                hours += (x + mid - 1) / mid;

                // No need to continue if already impossible
                if (hours > h) {
                    break;
                }
            }

            if (hours <= h)
                high = mid-1;
            else
                low = mid + 1;
        }

        return low;
    }
}        

    
}
