import java.util.Scanner;

public class Pattern1 {

    public static void main(String... args) {
        Scanner  scan = new Scanner(System.in);
        System.out.println("Enter the Value of N:");
        int n = scan.nextInt();

        for (int i=0;i<=n;i++) {
            for (int j=0;j<=i;j++) {
                if (i>1) {
                    if (j == 0 || j == i) {
                        System.out.print(i);
                    } else System.out.print("0");
                }else
                    System.out.print(i);
            }
            System.out.println();
        }
    }
}
