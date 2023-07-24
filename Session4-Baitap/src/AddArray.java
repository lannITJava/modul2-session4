import java.util.Arrays;

public class AddArray {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = {5,6,7,8};
        int[] array3 = new int[array1.length+array2.length];
        int pos =0;
        for (int element:array1) {
            array3[pos]=element;
            pos++;
        }
        for (int element:array2) {
            array3[pos]=element;
            pos++;
        }
        System.out.println(Arrays.toString(array3));
    }
}
