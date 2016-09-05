import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class Main {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		long n,res,first,second,temp;
		
		while(t-->0)
		{
			 first=0;
			 second=1;
			 temp=1;
			 res=0;
			 n = Long.parseLong(br.readLine());
			 
			 while(temp<=n)
			 {
				temp=second+first;
				first=second;
				second=temp;
				res++;
			 }
			 
			 System.out.println(res-1);	
		}
		
	}
 
}
 
