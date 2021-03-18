import java.util.Scanner;

// tim uoc chung lon nhat, boi chung nho nhat
public class UocChungLonNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhap so thu 1: ");
        int num1 = input.nextInt();
        System.out.printf("Nhap so thu 2: ");
        int num2 = input.nextInt();

        System.out.println("Uoc chung lon nhat la: " + UCLN(num1, num2));
        System.out.println("Uoc chung lon nhat la: " + BCNN(num1, num2));
        input.close();
    }

    // Định lý Euclid
    public static int UCLN(int a, int b) {
        if (b == 0) return a;
        return UCLN(b, a % b);
    }
    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }
}
