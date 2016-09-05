import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
 
 
 class Main {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out,true);
		int tc = Integer.parseInt(br.readLine().trim());
		long[] sum_arr=new long[1000001];
		for(long i=1;i<=1000000;i++){
			sum_arr[(int)i]=(i*(i+1)*(2*i+1))/6;
		}
		while(tc-->0){
			
			long S = Long.parseLong(br.readLine().trim());
			
			int idx=Arrays.binarySearch(sum_arr, S );
			
			if(idx<0){
				idx=-idx;
				idx=idx-2;
			}
			
			long ans=idx;
			out.println(ans);
			
		}
 
	}
 
}
  
