import java.util.Scanner;

public class CeilFlowers
{
 public static void main(String[] args) 
 {
  Scanner in = new Scanner(System.in);
  int[] n = new int[3];
  n[0] = in.nextInt();
  n[1] = in.nextInt();
  n[2] = in.nextInt();
  int min = Math.min(n[0], Math.min(n[1], n[2]));
  int sol = 0;
  if (min >= 2)
   sol = Math.max(sol,
     2 + ((n[0] - 2) / 3 + (n[1] - 2) / 3 + (n[2] - 2) / 3));
  if (min >= 1)
   sol = Math.max(sol,
     1 + ((n[0] - 1) / 3 + (n[1] - 1) / 3 + (n[2] - 1) / 3));
  sol=Math.max(sol, n[0]/3+n[1]/3+n[2]/3);
  System.out.println(sol);
 }
}
