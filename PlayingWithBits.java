import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
 
 
 class Main {
 
	public static int solve(int i)
	{
		     i = i - ((i >> 1) & 0x55555555);
		     i = (i & 0x33333333) + ((i >> 2) & 0x33333333);
		     return (((i + (i >> 4)) & 0x0F0F0F0F) * 0x01010101) >> 24;		
	}
	  
	public static void main(String[] args) throws IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String str1;
    	char ch[];
    	int t;
    	String str = br.readLine();
    	String s[]=str.split(" ");
    	t=Integer.parseInt(s[0]);
    	while(t-->0)
    	{
    		boolean flag = false;
    		int sum,j=0;
    		str = br.readLine();
    		String s1[] = str.split(" ");
    		int n = Integer.parseInt(s1[0]);
    		int k = Integer.parseInt(s1[1]);
 
    		int i = n-1;
    		while(!flag)
    		{	
 
    			if(k==0){
        			System.out.println(-1);break;}
    			sum = solve(i);
    			if(sum<=k)
    			{
    				flag = true;
    				System.out.println(i);
    				break;
    			}
    			else if(sum>k){
    				
    			str = Integer.toBinaryString(i); //System.out.println(str);
    			
    			int p =sum-k;
    			StringBuilder myName = new StringBuilder(str);
    			for(int m=str.length()-2;p>0 && m>=0;m--)
    			{
    				
    				if(str.charAt(m)=='1')
    				{	myName.setCharAt(m, '0');p--;}
    			}
    		
    			i = Integer.parseInt(myName.toString(),2);
    			
    			System.out.println(i);
    			flag=true;
    			break;
    			}
    			   			
    		}		
    	}
	} 
}

