
/*
 * uncomment this if you want to read input.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
		*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){
	        String str[] = br.readLine().split(" ");
	        long n = Long.parseLong(str[0]);
	        long k = Long.parseLong(str[1]);
	        
	        long sum = n*(n+1)/2;
			if(sum>k){
				System.out.println(sum-k);
			}
			if(sum<k){
				
				k=k%sum;
				if(k==0){
					System.out.println(k);
				}
				else System.out.println(sum-k);
			}
			else if(sum==k) System.out.println(0);
 
        }
        
    }
}
