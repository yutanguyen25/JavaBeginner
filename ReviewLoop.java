import java.util.Random;
import java.util.Scanner;

/*  In ra so nguyen trong n m
    Dem so nguyen to
    tong cac so chinh phuong
*/

public class ReviewLoop {
    public static void main(String[] args) {
        Random randomNum = new Random();

        int limit = 100;
        int limitUp = randomNum.nextInt(limit);
        int limitDown = randomNum.nextInt(limit);
        
        //Neu so tren lon hon so duoi thi thuc hiện việc đổi số ở đây
        int changeNum;
        if (limitUp > limitDown) {
            changeNum = limitDown;
            limitUp = limitDown;
            limitDown = changeNum;
        }
        
        System.out.printf("Gioi han tren: %d\n", limitUp);
        System.out.printf("Gioi han duoi: %d\n", limitDown);

        // In ra dãy số
        int index;
        System.out.println("Day so nguyen:");
        for (index = limitUp; index <= limitDown; index++) {
            System.out.println(index);
        }
        
        //In ra so nguyen to
        System.out.println("Day so nguyen to la:");
        for (index = limitUp; index <= limitDown; index++) {
        }
    }
}
