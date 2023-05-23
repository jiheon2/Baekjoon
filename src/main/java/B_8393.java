import java.util.Scanner;

public class B_8393 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        int hap = 0;

        n = s.nextInt();

        for(int i=1; i<=n; i++) {
            hap += i;
        }
        System.out.print(hap);
    }
}
