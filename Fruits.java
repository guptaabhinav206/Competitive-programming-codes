import java.util.Scanner;
 
 
 class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			
			int temp = Math.abs(n-m);
			if(temp<=k){
				System.out.println(0);
			}
			else{
				System.out.println(temp-k);
			}
		}
 
	}
 
}
