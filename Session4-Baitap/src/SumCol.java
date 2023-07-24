import java.util.Scanner;

public class SumCol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số cột");
        int col = Integer.parseInt(scanner.nextLine());
        float[][] arrayFloat = new float[row][col];
        for (int i = 0; i < arrayFloat.length; i++) {
            for (int j = 0; j < arrayFloat[i].length; j++) {
                System.out.printf("Nhập vào giá trị của phần tử dòng %d cột %d ",(i+1),(j+1));
                arrayFloat[i][j]= Float.parseFloat(scanner.nextLine());
            }
        }
        System.out.println("Nhập vào thứ tự của cột (tính từ 0)");
        int colum = Integer.parseInt(scanner.nextLine());
        float sum =0;
        for (int i = 0; i < arrayFloat.length; i++) {
            sum+=arrayFloat[i][colum];
        }
        System.out.printf("Tổng các phần tử của cột %d thứ là: %f",colum,sum);
    }
}
