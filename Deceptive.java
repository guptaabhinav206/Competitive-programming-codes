import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
 
 class Main {
 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			
			int n = Integer.parseInt(br.readLine());
			int arr[] = new int[n];
			int i=0;long sum=0;
			String str[] = br.readLine().split(" ");
			for(String s:str){
				arr[i] = Integer.parseInt(s);
				sum+=arr[i];
				i++;
				
			}
			
			long sum_ending_here=0;
			int count=0;
			Arrays.sort(arr);
			for(i=n-1;i>=0;i--){
 
				if(!(sum_ending_here>sum/2)){
					sum_ending_here+=arr[i];
					count++;
				}
				else break;
				
			}
			System.out.println(count);
			
			
			
		}
 
	}
 
}
