import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        int p,n;
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> hs=new HashSet<Integer>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
         p=sc.nextInt();
         n=sc.nextInt();
    
        int arr[]=new int[n];
        int brr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]= Integer.parseInt(sc.next());
        for(int i=0;i<n;i++)
        {
            brr[i]=arr[i]%p;
        }
        int count=1;
        for(int i=0;i<n;i++)
        {
            if(hs.add(brr[i])==true)
            {
                count++;
            }
            else break;
        }
        //System.out.println(brr.length);
        if(count==(brr.length+1))
            System.out.println(-1);
        else System.out.println(count);
    }

}
