import java.util.Random;
import java.util.Scanner;

/*Nhap a b c
Ktra co tao thanh tam giac ko
Neu la tam giac thi la loai nao
 */

 public class TamGiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomNum = new Random();

        int limit = 100;

        int canh1 = randomNum.nextInt(limit);
        int canh2 = randomNum.nextInt(limit);
        int canh3 = randomNum.nextInt(limit);

        System.out.println("Cac canh la:");
        System.out.println(canh1);
        System.out.println(canh2);
        System.out.println(canh3);

        if (!((canh1 + canh2 > canh3) && (canh2 + canh3 > canh1) && (canh1 + canh3 > canh2))) {
            System.out.println("Tam giac ban nhap khong hop le!");
        } else {
            if (canh1 == canh2 && canh2 == canh3) {
                System.out.println("Day la tam giac deu");
            } else if (canh1 == canh2 || canh2 == canh3 || canh3 == canh1 ) {
                System.out.println("Day la tam giac can");
            } else if ( canh1*canh1==canh2*canh2+canh3*canh3 || canh2*canh2==canh3*canh3+canh1*canh1 || canh3*canh3==canh1*canh1+canh2*canh2 ) {
                if (canh1 == canh2 || canh2 == canh3 || canh3 == canh1 ) {
                    System.out.println("Day la tam giac vuong can");
                } else {
                    System.out.println("Day la tam giac vuong");
                }
            } else if (canh1*canh1 > canh2*canh2 + canh3*canh3 || canh2*canh2 > canh3*canh3 + canh1*canh1 || canh3*canh3 > canh1*canh1 + canh2*canh2 ) {
                System.out.println("Day la tam giac tu");
            } else {
                System.out.println("Day la tam giac nhon");
            }
        }

        input.close();
    }
}
