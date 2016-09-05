import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.*;
 
 class Main {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-->0){
			
			String s1[] = br.readLine().split(" ");
			int h  = Integer.parseInt(s1[0]);
			int n  = Integer.parseInt(s1[1]);
			int m  = Integer.parseInt(s1[2]);
			float sum=0,count=0;
			if(n>=h){
				float val = (float)h/n;
				out.println(String.format("%.2f", val));
			}
			else{
			//	int temp1 = n-m;
				while(sum<=(h-n)){
					
					sum+=(n-m);
					
					count++;
					if(sum+n==h){
						break;
					}
				}
				//sum+=h/sum;
				if((h-sum)!=n){
					count=count+(h-sum)/n; out.println(String.format("%.2f", count));}
				//out.println(sum);
				else
				out.println(String.format("%.2f", count+1));
			}
			
		}
	}
}
