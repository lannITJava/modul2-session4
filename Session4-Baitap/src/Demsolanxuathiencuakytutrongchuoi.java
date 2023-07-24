import java.util.Scanner;

public class Demsolanxuathiencuakytutrongchuoi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string = "DINH THI HOANG LAN";
        System.out.println("Nhập vào một ký tự");
        char kytu = scanner.nextLine().charAt(0);
        int count =0;
        for (int i = 0; i < string.length(); i++) {
            if (kytu==string.charAt(i)){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự "+kytu+ "trong chuỗi "+string+ "= "+count);
    }
}
