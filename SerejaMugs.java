import java.util.Arrays;
import java.util.Scanner;

public class SerejaAndMugs {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //no of players including Sereja
        int c = scan.nextInt(); //capacity of the cup

        int mugs[] = new int[n];
        for (int i = 0; i < n; ++i) {
            mugs[i] = scan.nextInt();
        }

        Arrays.sort(mugs);
        int t = 0;
        for (int i = 0; i < n - 1; ++i) {
            t += mugs[i];
            if (mugs[i] <= c && t <= c) {
                continue;
            } else {
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");
    }
}
