class Solution {
    public int searchInsert(int[] nums, int target) {
        return partition(nums, target,0,nums.length);
    }

    int partition(int[] nums, int target,int l,int r)
    {
        if(l==r)return l;
        else
        {
            int mid=(l+r)/2;
            if(target>nums[mid]) return partition(nums, target,mid+1,r);
            else
            {
               return partition(nums, target,l,mid);
            }

        }

    }
}
