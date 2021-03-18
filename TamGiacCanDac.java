import java.util.Scanner;

public class TamGiacCanDac {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Nhap canh cua tam giac: ");
    int h = input.nextInt();
    int m = h;
    int n = h;

    for (int i = 1; i <= h; i++) {
        for (int j = 1; j <= (2 * h - 1); j++) {
            if (j >= m && j <= n) {
                System.out.print(" * ");
            } else {
                System.out.print("   ");
            }
        }
        m--;
        n++;
        System.out.println("");
    }
    input.close();
    }
}
