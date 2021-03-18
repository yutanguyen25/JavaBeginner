import java.util.Scanner;

public class MenuLamToan {
    // Ham nhap vao menu lua chon cua ban
    public static int printMenu(int choiceNum) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Ban nhap sai roi, Moi nhap lai: ");
            choiceNum = input.nextInt();
        } while (1 > choiceNum || choiceNum > 4);
        input.close();
        return choiceNum;
    }

    //Ham nhap 2 so n, m
    public static int enterNum(int enterNumber) {
        Scanner input = new Scanner(System.in);
        System.out.print("Moi ban nhap so: ");
        enterNumber = input.nextInt();
        while (enterNumber <= 0) {
            System.out.print("Ban phai nhap so duong, moi nhap lai: ");
            enterNumber = input.nextInt();
        };
        input.close();
        return enterNumber;
    }
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.print("Moi nhap lua chon: ");
        // int luaChon = input.nextInt();
        // printMenu(luaChon);

        System.out.println("Nhap n: ");
        int n = 0;
        System.out.println(enterNum(n));
        System.out.println("");
        System.out.println("Nhap m: ");
        int m = 0;
        System.out.println(enterNum(m));
        //
        // input.close();
    }
}
