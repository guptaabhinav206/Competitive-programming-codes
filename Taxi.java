import java.util.Scanner;
import java.util.Arrays;
public class taxi{
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        int limit,a,i,b,j,c,d,ans,four;
        limit = in.nextInt();
        int[] x = new int[limit];
        int[] y = new int[limit];
        for(a=0;a<limit;a++){
        x[a] = in.nextInt();
        }
        Arrays.sort(x);
 
    for(c=limit-1,d=0;c>=0;c--,d++){
        y[d]=x[c];
    }
    for(c=0;c<limit;c++){
        x[c]=y[c];
    }
    j = limit-1;
    ans = 0;
    i = 0;
    while (i<=j){
        ans++;
        four = 4-x[i];
        while (x[j]<=four && j>=i){
            four = four-x[j];
            j--;
        }
        i++;
    }
    System.out.format("%d",ans);
    }
}
