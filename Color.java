import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		try {
			t = Integer.parseInt(br.readLine().trim());
			
			while(t-->0){
				int n = Integer.parseInt(br.readLine().trim());
				String str = br.readLine();
				int count[] = new int[83];
				
				for(int i=0;i<str.length();i++){
					count[str.charAt(i)]++;
				}
				int max = Integer.MIN_VALUE;
				long sum=0;
				for(int i=0;i<count.length;i++){
					sum+=count[i];
					if(max < count[i]){
						max = count[i];
					}					
				}
				if(sum-max>0)
					System.out.println(sum-max);
				else System.out.println(0);
			}
			
			
			
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
 
}
