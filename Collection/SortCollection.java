import java.util.ArrayList;
import java.util.Collections;

class SortCollection{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(24);
        list.add(2);
        list.add(44);
        list.add(9);
        list.add(81);

        Collections.sort(list);
        System.out.print("Accesending Order  ");
        System.out.println(list);
        Collections.sort(list, (i1, i2)-> (i1>i2) ? -1 : (i1<i2) ? 1 : 0);
        System.out.println("Desending Order ");
        System.out.print(list);
    }
}