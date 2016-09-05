import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class Main {
 
    static int count=0;
 
    public static void solve(long arr[],long b[],int i,int n){
 
        long k=i;
        b[(int)k]=i+1;
        while(true)
        {
            k=(k+arr[(int)k]+1)%n;
            if(b[(int)k]==0) {
                b[(int)k] = i + 1;
            }
            else if(b[(int)k]==(i+1)){
                countloop(arr,k, n);
                break;
            }
            else if(b[(int)k]!=0)
                break;
        }
    }
    public static void countloop(long arr[],long k,int n){
        long temp=(k+arr[(int)k]+1)%n;
        count++;
        while(temp!=k)
        {
            temp=(temp+arr[(int)temp]+1)%n;
            count++;
        }
    }
 
    public static void main(String[] args) {
 
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[100002];
            long visited[] = new long[100002];
            while (t-- > 0) {
                count = 0;
                int n  = Integer.parseInt(br.readLine().trim());
 
                int i=0;
                String str[] = br.readLine().split(" ");
                for(String s:str){
                    arr[i]=Integer.parseInt(s);
                    i++;
                }
                for(i=0;i<n;i++)
                 visited[i]=0;
                for(i=0;i<n;i++) {
                    if(visited[i]==0)
                        solve(arr, visited, i, n);
                }
                System.out.println(count);
        }}
        catch(Exception e){
            System.out.println(e);
        }
    }
}
 
