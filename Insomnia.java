import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class InsomniaCure {

    public static void main(String[] args)throws IOException {
        // TODO Auto-generated method stub
    //  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int l=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();
        int d=sc.nextInt();
        //int arr[]=new int[d];
        int count=0;
    //  String str=br.readLine();
        for(int i=1;i<=d;i++)
        {
            if(i%k==0)
                count++;
            else if(i%l==0)
                count++;
            else if(i%m==0)
                count++;
            else if(i%n==0)
                count++;
            
        }
        //System.out.printf("%d\n", count);
        System.out.println(count);
    }
}
