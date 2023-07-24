import java.util.Scanner;

public class Giatrimintrongarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrInt =new int[6];

        for (int i = 0; i < arrInt.length; i++) {
            System.out.println("Nhập vào các phần tử của mảng");
            arrInt[i]=Integer.parseInt(scanner.nextLine());
        }
        int min = arrInt[0];
        for (int i = 1; i < arrInt.length ; i++) {
            if (min>arrInt[i]){
                min= arrInt[i];
            }
        }
        System.out.printf("Giá trị phần tử nhỏ nhất là "+min);
    }
}
