import java.util.Random;
import java.util.Scanner;

public class HienThiMang {
    public static void main(String[] args) {
        //Khai bao so luong phan tu cua mang
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang vao:");
        int num = input.nextInt();

        //Tao ra mang nhap num phan tu
        int[] arr1 = new int[num];

        // Lay random cac gia tri
        Random random = new Random();
        int limit = 100;

        //Nhap gia tri
        System.out.println("");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhap so thu " + (i + 1) + " : ");
            arr1[i] = random.nextInt(limit);
            System.out.println(arr1[i]);
        }

        // In gia tri
        System.out.println("");
        System.out.println("Mang ne");
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("%d ",arr1[i]);
        }
        System.out.println("");
        
        // Tim max min
        System.out.println("");
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (max < arr1[i]) {
                max = arr1[i];
            }
        }
        System.out.println("Max: ");
        System.out.println(max);
        System.out.println("-----------------------------------");
    }
}
