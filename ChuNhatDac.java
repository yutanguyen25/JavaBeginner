import java.util.Scanner;

public class ChuNhatDac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Moi ban nhap 2 canh: ");
        System.out.print("Canh ngang: ");
        int canhNgang = input.nextInt();
        System.out.print("Canh doc: ");
        int canhDoc = input.nextInt();

        for (int i = 1; i <= canhDoc; i++) {
            for (int j = 1; j <= canhNgang; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        input.close();
    }
}
