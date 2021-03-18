import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Moi ban nhap so: ");
        int enterNumber = input.nextInt();
        do {
            System.out.print("Ban phai nhap so duong, moi nhap lai: ");
            enterNumber = input.nextInt();
        } while (enterNumber <= 0);
        System.out.println(enterNumber);
        input.close();
    }
}