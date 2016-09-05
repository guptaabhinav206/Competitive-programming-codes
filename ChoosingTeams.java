import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static Main main;
    public static void main(String args[] ) throws Exception {
        main=new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //  int t = Integer.parseInt(br.readLine());
        String str=br.readLine();
        int arr[]=new int[2001];
        int brr[]=new int[2001];
        try
        {
        String s[]=str.split(" ");
        int n=Integer.parseInt(s[0]);
        int k=Integer.parseInt(s[1]);
        str = br.readLine();
        StringTokenizer tokenizer = new StringTokenizer(str);
        for(int i=0;i<n;i++)
            arr[i]= Integer.parseInt(tokenizer.nextToken());
        while(k-->0)
        for(int i=0;i<n;i++)
        {
            arr[i]++;
        }
        
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=5)
            {
                brr[j]=arr[i];
                j++;
            }
            else continue;
        }
        //System.out.println(j);
        System.out.println(j/3);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
