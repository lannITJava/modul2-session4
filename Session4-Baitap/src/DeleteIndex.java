import java.util.Arrays;

public class DeleteIndex {
    public static void main(String[] args) {
        int[] arrayCu = {10, 7, 6, 7, 8, 6};
        //int[] arrayMoi = new int[10];
        int deleteIndex =-2;
        for (int i = 0; i < arrayCu.length; i++) {
            if (arrayCu[i]==7){
                deleteIndex=i;
                break;
            }
        }
        if (deleteIndex>=0){
            int[] arrayNew= new int[arrayCu.length-1];
            for (int i = 0; i < arrayCu.length; i++) {

                if (i<deleteIndex){
                    arrayNew[i]=arrayCu[i];
                }else if (i>deleteIndex){
                    arrayNew[i-1]=arrayCu[i];
                }
            }
            System.out.println(Arrays.toString(arrayNew));
        }else {
            System.out.println("Giá trị 7 không tồn tại trong màng");
        }

    }
}
