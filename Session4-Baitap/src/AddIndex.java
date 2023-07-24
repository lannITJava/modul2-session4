import java.util.Arrays;

public class AddIndex {
    public static void main(String[] args) {
        int[] array_cu ={10, 4,6,7,8};
        int[] arrayMoi = new int[10];
        int indexAdd =3;
        int numberAdd = 12;
        for (int i = 0; i < array_cu.length; i++) {
            if (i <indexAdd){
                arrayMoi[i]=array_cu[i];
            } else if (i == indexAdd) {
                arrayMoi[indexAdd]=numberAdd;
                arrayMoi[i+1]=array_cu[i];
            }else {
                arrayMoi[i+1]=array_cu[i];
            }
        }
        System.out.println(Arrays.toString(arrayMoi));
    }
}
