public class Max2inArray {
    public static void main(String[] args) {
        int[] arrayInt= {5,8,9,6,3,7};
        int max1 = Integer.MIN_VALUE;
        int max2 =Integer.MIN_VALUE;
        for (int i = 0; i <arrayInt.length ; i++) {
            if (arrayInt[i]>max1){
                max2=max1;
                max1=arrayInt[i];
            } else if (arrayInt[i]>max2&&arrayInt[i]!=max1) {
                max2=arrayInt[i];
            }
        }
        System.out.println("Số lớn thứ hai trong mảng là: " + max2);
    }
}
