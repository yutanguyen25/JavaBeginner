import java.util.Random;
import java.util.Scanner;

public class TinhChuVi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomNum = new Random();

        int limit = 100;

        int canh1 = randomNum.nextInt(limit);
        int canh2 = randomNum.nextInt(limit);

        System.out.println(canh1);
        System.out.println(canh2);


        input.close();
    }
}
    