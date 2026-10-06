package binary_search;

public class Search_in_rotated_sorted_array_1 {
    
    public int search(int[] nums, int k) {
       int low=0,high=nums.length-1;
       int pivot=0;
       while(low<=high){
        int mid = low+(high-low)/2;
        if(nums[mid]<nums[pivot]){
            pivot=mid;
            high=mid-1;
        }
        else low=mid+1;
       }
       if(k<=nums[nums.length-1])return binsearch(pivot,nums.length-1,k,nums);

       else
           return binsearch(0,pivot-1,k,nums);
    }
    public int binsearch(int low,int high,int k,int[] nums){
          while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==k)return mid;
            else if(nums[mid]<k)low=mid+1;
            else high=mid-1;
          }
          return -1;
    }

}
