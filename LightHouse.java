import java.io.*;
 
 
class Main
{
	
	static void solve() throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim());
		int x = 0, y=1;
		
		for(int j = 0 ;j< t; j++){
			
			int a = 1000000001, ap = -1;
			int b = -1000000001, bp = -1;
			int c = 1000000001, cp = -1;
			int d = -1000000001, dp = -1;
			
			int n = Integer.parseInt(br.readLine().trim());
			
			int arr[][] = new int [n][2];
			
			for(int i = 0; i< n; i++){
				String s[] = br.readLine().trim().split(" ");
				arr[i][x]=Integer.parseInt(s[x]);
				arr[i][y]=Integer.parseInt(s[y]);
				if(a>arr[i][y]){
					a=arr[i][y];
					ap=i+1;
				}
				if(b<arr[i][y]){
					b=arr[i][y];
					bp=i+1;
				}
				if(c>arr[i][x]){
					c=arr[i][x];
					cp=i+1;
				}
				if(d<arr[i][x]){
					d=arr[i][x];
					dp=i+1;
				}
			}
			if(ap==cp)
			{
				pw.println(1);
				pw.println(ap+" NE");
			}
			else if(ap==dp)
			{
				pw.println(1);
				pw.println(ap+" NW");
			}
			else if(bp==cp){
				pw.println(1);
				pw.println(bp+" SE");
			}
			else if(bp==dp){
				pw.println(1);
				pw.println(bp+" SW");
			}
			else if(arr[bp-1][x]>=arr[ap-1][x]){
				pw.println(2);
				pw.println(bp+" SW");
				pw.println(ap+" NE");
			}
			else if(arr[bp-1][x]<=arr[ap-1][x]){
				pw.println(2);
				pw.println(ap+" NW");
				pw.println(bp+" SE");
			}
			else if(arr[cp-1][y]>=arr[dp-1][y]){
				pw.println(2);
				pw.println(cp+" SE");
				pw.println(dp+" NW");
			}
			else if(arr[dp-1][y]>=arr[cp-1][y]){
				pw.println(2);
				pw.println(dp+" SW");
				pw.println(cp+" NE");
			}
 
		}
		pw.flush();
		
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{		
		solve();		
	}
}  
