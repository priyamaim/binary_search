package binary_search;

public class floor_and_ceil {

    public int[] getFloorAndCeil(int[] nums, int x) {
        
        int low = 0, high = nums.length - 1;
        int floor = -1, ceil = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == x) {
                return new int[] {x, x};
            } else if (nums[mid] < x) {
                floor = nums[mid]; // possible floor
                low = mid + 1;
            } else {
                ceil = nums[mid]; // possible ceil
                high = mid - 1;
            }
        }
        return new int[] {floor, ceil};
    }
    
}
