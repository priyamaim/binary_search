package binary_search;

import java.util.ArrayList;

public class how_many_times_array_is_rotated {
    
     public int findKRotation(ArrayList<Integer> nums) {
       int low=0;
     int high=nums.size()-1;
     int pivot=0;
     while(low<=high){
        int mid=low+(high-low)/2;
        if(nums.get(pivot)>nums.get(mid)){
            pivot=mid;
            high=mid-1;
        }
        else low=mid+1;
     } 
     if(pivot-1<0)return 0;
     return pivot;
    }

}
