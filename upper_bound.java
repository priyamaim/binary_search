package binary_search;

public class upper_bound {
    public int upperBound(int[] nums, int x) {
    int low =0;
    int high =nums.length;
    while(low<high){
        int mid=low+(high-low)/2;

        if (nums[mid] <= x) {
                low = mid + 1; 
            } else {
                high = mid;
            }
        
      } 
      return low;
    }
}
