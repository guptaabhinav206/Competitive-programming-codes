import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
 class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-->0){
			String str[] = br.readLine().split(" ");
			int flag = 0;
			long n = Long.parseLong(str[0]);
			long m = Long.parseLong(str[1]);
			
			if(n%2!=0 && m%2!=0)
			{
				System.out.println("No");
			}
			else
			{
			   if((n==1 || m==1) && (n>2 || m>2))
			   {
					System.out.println("No");
			   }
			   else
			   {
					System.out.println("Yes");
			   }
			}
		}
}} 

