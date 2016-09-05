import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
class Main {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-->0){
			
			String s1[] = br.readLine().split(" ");
			int n  = Integer.parseInt(s1[0]);
			int h  = Integer.parseInt(s1[1]);
			int x  = Integer.parseInt(s1[2]);
			int i  = Integer.parseInt(s1[3]);
			
			String s2[] = br.readLine().split(" ");
			int l  = Integer.parseInt(s2[0]);
			int s  = Integer.parseInt(s2[1]);
			
			int temp = Math.abs(h-i)*s;
			int temp2 = Math.abs(x-h)*l;
			int temp3 = Math.abs(h-i)*l+temp2;
			
			if(temp>=temp3){
				System.out.println("LIFT");
			}
			else System.out.println("STAIRS");
			
		}
		
		
	}
 
}
