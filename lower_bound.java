package binary_search;

public class lower_bound {
    public int lowerBound(int[] nums, int x) {
     int low =0;
      int high =nums.length;
      while(low<high){
        int mid=low+(high-low)/2;

        if(nums[mid]<x) low = mid+1;

        else high=mid;
        
      } 
      return low;  
     }
}
