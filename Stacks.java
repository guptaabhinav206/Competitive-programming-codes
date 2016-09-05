import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
 
class Main {
 
	public static int binarySearch(int size,int val,int top[]){
		
		int low = 0, high = size-1;
		int ans = size;
		
		while(low<=high){
			
			int mid = (low+high)/2;
			
			if(top[mid]>val){
				ans=mid;
				high=mid-1;
			}
			else{
				low=mid+1;
			}
			
		}
		
		return ans;
		
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out,true);
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
			int i=0;
			int n = Integer.parseInt(br.readLine().trim());
			int arr[] = new int[n];
			int top[]=new int[n];
			String s[]=br.readLine().split(" ");
			for(String str:s){
				arr[i]=Integer.parseInt(str);
				i++;
			}
			int size=0;
			for(i=0;i<n;i++){
				
				
					int idx = binarySearch(size,arr[i],top);
					
					top[idx]=arr[i];
					
					if(idx==size)size++;
				
				
			}
			pw.print(size);
			for(i=0;i<size;i++){
				pw.print(" ");
				pw.print(top[i]);
				
			}
		
			pw.println();
			
	}
	}
}
 
