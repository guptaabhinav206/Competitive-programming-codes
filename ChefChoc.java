import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class Main {
 
    public static void main(String[] args) {
 
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        try {
            int t = Integer.parseInt(br.readLine().trim());
            while (t-- > 0) {
 
                String s[] = br.readLine().split(" ");
                int m = Integer.parseInt(s[0]);
                int n = Integer.parseInt(s[1]);
                if (m * n % 2 == 0)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
} 
