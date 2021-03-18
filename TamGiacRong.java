import java.util.Scanner;

public class TamGiacRong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap canh cua tam giac: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n) {
                    System.out.print(" ");
                    System.out.print("*");
                    System.out.print(" ");
                } else {
                    System.out.print(" ");
                    System.out.print(" ");
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        input.close();
    }
}
