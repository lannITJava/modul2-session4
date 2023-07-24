import java.util.Scanner;

public class Phantulonnhattrongmanghaichieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số cột");
        int col = Integer.parseInt(scanner.nextLine());
        float[][] arrFloat = new float[row][col];
        for (int i = 0; i < arrFloat.length ; i++) {
            for (int j = 0; j < arrFloat[i].length; j++) {
                System.out.printf("Nhập giá trị phần tử dòng %d cột %d ",i+1,j+1);
                arrFloat[i][j]= Float.parseFloat(scanner.nextLine());
            }
        }
        float max= arrFloat[0][0] ;
        for (int i = 0; i < arrFloat.length; i++) {
            for (int j = 1; j < arrFloat[i].length; j++) {
                if (max<arrFloat[i][j]){
                    max= arrFloat[i][j];
                }
            }
        }
        System.out.printf("Phần tử lớn nhất có giá trị %f",max);
    }
}
