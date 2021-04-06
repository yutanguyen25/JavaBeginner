import java.util.Random;
import java.util.Scanner;
/**
*
* @author Chung Trinh
*/
public class BTArr {
/* => Menu chức năng:
- 1. Nhập vào số nguyên dương n;
- 2. Khai báo mảng 2 chiều NxN
- . Nhập giá trị cho các phần tử trong mảng
- 3. In ma trận NxN
- 4. In ma trận NxN => chỉ in viền và chéo chính, chép phụ
- 5. Tính tổng các phần tử trên chéo chính + chéo phụ
- 6. Tính tổng các phần tử trên hàng chẵn
- 7. Tính tổng các phần tử trên cột lẻ
- 8. Thoát
*/
    static void menu() {
        System.out.println("\n "
        + " => Menu chức năng:"
        + "\n - 1. Nhập vào số nguyên dương n;"
        + "\n - 2. Khai báo mảng 2 chiều NxN;"
        + "\n - . Nhập giá trị cho các phần tử trong mảng;"
        + "\n - 3. In ma trận NxN;"
        + "\n - 4. In ma trận NxN => chỉ in viền và chéo chính, chép phụ"
        + "\n - 5. Tính tổng các phần tử trên chéo chính + chéo phụ;"
        + "\n - 6. Tính tổng các phần tử trên hàng chẵn;"
        + "\n - 7. Tính tổng các phần tử trên cột lẻ;"
        + "\n - 8. Thoát.");
    }
    public static void main(String[] args) {
        int n = 0;
        int[][] arr = new int[0][0];
        int chon;
        do {
            menu();
            System.out.print("Chon chức năng:");
            Scanner input = new Scanner(System.in);
            chon = input.nextInt();
            switch (chon) {
                case 1:
                System.out.println("\n 1. Nhập vào số nguyên dương n;");
                System.out.print("n=");
                n = input.nextInt();
                break;
            case 2:
                System.out.println("\n 2. Nhập giá trị cho các phần tử trong mảng;");
                arr = new int[n][n];
                inputArray(arr, n);
                break;
            case 3:
                System.out.println("\n 3. In ma trận NxN;");
                printArr(arr, n);
                break;
            case 4:
                System.out.println("\n 4. In ma trận NxN => chỉ in viền và chéo chính, chéo phụ");
                printArr4(arr, n);
                break;
            case 5:
                System.out.println("\n 5. Tính tổng các phần tử trên chéo chính + chéo phụ;");
                System.out.println("\n tong = "+ tongArr(arr,n));
                break;
            case 6:
                System.out.println("\n 6. Tính tổng các phần tử trên hàng chẵn;");
                System.out.println("\n tong = "+ tongHangChan(arr,n));
                break;
            case 7:
                System.out.println("\n 7. Tính tổng các phần tử trên cột lẻ;");
                System.out.println("\n tong = "+ tongCotLe(arr,n));
                break;
            case 8:
                break;
                default:
            System.out.println("Bạn chọn sai chức năng");
            }
        } while (true);
    }
    static void inputArray(int[][] arr, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("\n arr[%d][%d]=", i, j);
                // arr[i][j] = sc.nextInt();
                Random rand = new Random();
                arr[i][j] = rand.nextInt(99);
            }
        }
    }
    static void printArr(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println("\n");
        }
        System.out.println("");
    }
    static void printArr4(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0 || i==n-1 || j==0 || j==n-1 || i==j || i==n-j-1)
                    System.out.printf("%4d", arr[i][j]);
                else
                    System.out.printf("%4s", " ");
            }
            System.out.println("\n");
            }
        System.out.println("");
    }
    static int tongArr(int[][] arr, int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if( i==j || i==n-j-1)
                tong += arr[i][j];
            }
        }
        return tong;
    }
    static int tongHangChan(int[][] arr, int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if( i%2==0)
                tong += arr[i][j];
            }
        }
        return tong;
    }
    static int tongCotLe(int[][] arr, int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if( j%2 !=0)
                tong += arr[i][j];
            }
        }
        return tong;
    }
}
