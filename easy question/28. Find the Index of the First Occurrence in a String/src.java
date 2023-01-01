class Solution {
    public int strStr(String haystack, String needle) {
        int flag=0;
        if(needle.length()>haystack.length())return -1;
        else
        {
            for(int i=0;i<=haystack.length()-needle.length();i++)
            {
                flag=0;
            	for(int j=0;j<needle.length();j++)
            	{
            		if(haystack.charAt(i+j)==needle.charAt(j));
            		else flag=-1;
            	}
            	if(flag==0)return i;
            }
            return -1;
        }
    }
}
