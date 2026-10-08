package binary_search;

public class Find_square_root_using_binary_search {

    public int floorSqrt(int n) {
        if (n == 0 || n == 1) return n;
        int low = 1, high = n / 2;
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if ((long) mid * mid == n) return mid;
            else if ((long) mid * mid > n) high = mid - 1;
            else low = mid + 1;
        }
        return high;
    }
}
