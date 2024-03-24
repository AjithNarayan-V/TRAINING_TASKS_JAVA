import java.util.Scanner;

public class matrixOddEvenCount {
    public static void main(String[] args) {
        int Evenmin = Integer.MAX_VALUE;
        int Evenmax = Integer.MIN_VALUE;
        int Oddmin = Integer.MAX_VALUE;
        int Oddmax = Integer.MIN_VALUE;
        int row, col;
        int even = 0, odd = 0;
        System.out.println("Enter Row and col count:");
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        col = sc.nextInt();
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] % 2 == 0) {
                    even++;
                    if (Evenmin > arr[i][j]) {
                        Evenmin = arr[i][j];
                    }
                    if (Evenmax < arr[i][j]) {
                        Evenmax = arr[i][j];
                    }

                } else {
                    odd++;
                    if (Oddmin > arr[i][j]) {
                        Oddmin = arr[i][j];
                    }
                    if (Oddmax < arr[i][j]) {
                        Oddmax = arr[i][j];
                    }

                }
            }
        }
        System.out.println("Even Count:"+even);
        System.out.println("Even Min:"+Evenmin);
        System.out.println("Even Max:"+Evenmax);
        System.out.println("Odd Count:"+odd);
        System.out.println("Odd Min:"+Oddmin);
        System.out.println("Odd Max:"+Oddmax);




    }

}
