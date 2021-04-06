import java.util.Scanner;

public class Menu {
    public static void menu() {
        System.out.println("\n-----------Menu-----------"
        + "\n 1. Nhap so nguyen duong n"
        + "\n 2. Khai bao mang 2 chieu n*n"
        + "\n 3. Nhap gia tri cho phan tu trong mang"
        + "\n 4. In ma tran n*n"
        + "\n 5. In ma tran, cheo chinh, cheo phu"
        + "\n 6. Tinh tong cac phan tu tren cheo chinh, cheo phu"
        + "\n 7. Tinh tong cac phan tu hang chan"
        + "\n 8. Tinh tong cac phan tu cot le"
        + "\n 9. Thoat"
        );
    }
    public static int num() {
        System.out.println("");
        System.out.print("Moi ban nhap so n: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        while (num <= 0 || num > 100) {
            System.out.print("Ban nhap sai roi, moi nhap lai: ");
            num = input.nextInt();
        }
        return num;
    }
    public static int enterMenu() {
        System.out.println("");
        System.out.print("Moi ban nhap so lua chon: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        while (num <= 0 || num > 10) {
            System.out.print("Ban nhap sai roi, moi nhap lai: ");
            num = input.nextInt();
        }
        return num;
    }
    public static void main(String[] args) {
        // hien thi menu
        menu();

        //Nhap lua chon
        int choice = enterMenu();
        System.out.println(choice);
        //Nhap so nguyen duong n
        int n = num();
        System.out.println(n);
    }
}
