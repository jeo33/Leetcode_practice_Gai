class Solution {
	
public int lengthOfLastWord(String s) {
	
	int size=s.length();
	 int counter=0;
	 int flag=0;
      for(int i=size-1;i>=0;i--)
      {
          if(s.charAt(i)==' '&&flag==0)counter=0;
          if(s.charAt(i)==' '&&flag==1)break;
          else if(s.charAt(i)!=' ') {
        	  counter++;
        	  flag=1;
          }
          
      }
      return counter;
      
    }

}
