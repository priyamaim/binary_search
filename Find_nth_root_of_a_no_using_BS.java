package binary_search;

public class Find_nth_root_of_a_no_using_BS {
    public int NthRoot(int N, int M) {
       if(M < 2)return M;
       int low=1;
       int high=M;
       while(low<=high){
        int mid=low+(high-low)/2;
        if((long)Math.pow(mid,N)==M)return mid;
        else if((long)Math.pow(mid,N)<M)low=mid+1;
        else high=mid-1;
       }
       return -1;
    }
}
