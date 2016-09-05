import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
 class Main {
 
	static void palinSum(int n, int m){
		int temp;
		int sum,ans=0;
		 for(int num=n;num<=m;num++){
	         temp=num;
	         sum=0;
	         int r =0;
	         while(temp>0){
	             r=temp%10;
	             temp=temp/10;
	             sum=sum*10+r;
	         }
	         if(num==sum)
	             ans+=num;
	    }
		 System.out.println(ans);
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
			String s[] = br.readLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int m = Integer.parseInt(s[1]);
			palinSum(n,m);
			
		}
	}
 
}
