package binary_search;

public class first_and_last_occurence {

    public int[] searchRange(int[] nums, int target) {
        int[] output={-1,-1};
        output[0] = search(nums,target,true);//starting index
        output[1] = search(nums,target,false);//ending index
        return output;
    }

        int search(int[] nums,int target,boolean findstartindex){

        int low=0,high =nums.length-1;
        int output=-1;
        while(low <= high){
            int mid=low+(high-low)/2;
            if(target > nums[mid])
            low = mid+1;
            else if(target < nums[mid])
            high = mid-1;
            else{
                output=mid;
                if(findstartindex)
                   high = mid-1;
                else
                   low = mid+1;
                }
             }
        
        return output;
       
    }
    
}
