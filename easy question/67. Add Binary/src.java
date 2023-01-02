class Solution {
    public String addBinary(String a, String b) {
    	Stack<Character> stack1= new Stack<Character>();

    	Stack<Character> stack2= new Stack<Character>();
    	Stack<Character> ans= new Stack<Character>();
    	String l=new String();
    	char a1;
    	char a2;
    	char carry='0';
    	for(int i=0;i<a.length();i++)stack1.add(a.charAt(i));

    	for(int i=0;i<b.length();i++)stack2.add(b.charAt(i));
    	while(!(stack1.isEmpty()||stack2.isEmpty()))
    	{
    		a1=stack1.pop();
    		a2=stack2.pop();
    		if(a1==a2)
    		{
    			ans.add(carry);
    			if(a1=='1')carry='1';
    			else carry='0';
    		}
    		else
    		{
    			if(carry=='1')ans.add('0');
    			else ans.add('1');
    		}
    	}
    	if(stack1.isEmpty())
    	{
    		while(!stack2.isEmpty())
    		{
    			a2=stack2.pop();
    			if('0'==a2)
        		{
        			ans.add(carry);
        			carry='0';
        		}
        		else
        		{
        			if(carry=='1')ans.add('0');
        			else ans.add('1');
        		}
    		}
    	}
    	else if(stack2.isEmpty())
    	{
    		while(!stack1.isEmpty())
    		{
    			a1=stack1.pop();
    			if('0'==a1)
        		{
        			ans.add(carry);
        			carry='0';
        		}
        		else
        		{
        			if(carry=='1')ans.add('0');
        			else ans.add('1');
        		}
    		}
    	}
        if(carry=='1') ans.add('1');
    	while(!ans.isEmpty())
    	{
    		l=l+ans.pop();
    	}
    	return l;
    }
}
