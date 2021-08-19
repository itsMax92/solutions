package Java.assignments.pattern;

public class PatternThree {

    static void printRectangle(int n, int m) {
        //n number of rows
        //m number of columns
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=m;j++) {
                if (i==1 || i==n || j==1 || j==m) {
                    System.out.print("*");
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String... args) {

        printRectangle(6,4);
    }
}
