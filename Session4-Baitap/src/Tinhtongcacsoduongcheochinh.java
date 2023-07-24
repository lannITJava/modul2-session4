import java.util.Scanner;

public class Tinhtongcacsoduongcheochinh {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào số dòng và cột (số dòng và cột phải bằng nhau)");
        int rowCol = Integer.parseInt(scanner.nextLine());
        float[][] arrayFloat = new float[rowCol][rowCol];
        for (int i = 0; i < arrayFloat.length; i++) {
            for (int j = 0; j < arrayFloat[i].length; j++) {
                System.out.printf("Nhập vào giá trị phần tử dòng %d cột %d ",(i+1),(j+1));
                arrayFloat[i][j]=Float.parseFloat(scanner.nextLine());
            }
        }
        float sum = 0;
        for (int i = 0; i < arrayFloat.length; i++) {
            for (int j = 0; j < arrayFloat[i].length; j++) {
                if (i==j){
                   sum+= arrayFloat[i][j];
                }
            }
        }
        System.out.println("Tổng các số ở đường chéo chính là: "+sum);
    }
}
