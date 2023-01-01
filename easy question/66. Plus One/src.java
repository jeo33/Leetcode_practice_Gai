class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        for(int i=digits.length-1;i>=0;i--)
        {
        	digits[i]+=carry;
        	if(digits[i]==10)
            carry=1;
            else carry=0;
            digits[i]=digits[i]%10;
        	
        }
        if(carry==0) return digits;
        else
        {
        	int[] ans=new int[digits.length+1];
        	for(int i=0;i<digits.length;i++)
            {
            	ans[i+1]=digits[i];
            }
        	ans[0]=1;
        	return ans;
        }
        
    }
}
