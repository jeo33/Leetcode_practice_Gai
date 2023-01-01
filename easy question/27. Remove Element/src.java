class Solution {
    public int removeElement(int[] nums, int val) {

        int temp;
        int counter=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]!=val)
            {
                for(int j=i;j>=0;j--)
                {
                     if(nums[j]==val)
                     {
                        nums[j]= nums[i];
                        nums[i]=val;
                        break;
                     }
                }
            }
            
        }

        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]==val)counter++;
        }

        return nums.length-counter;
    }
}
