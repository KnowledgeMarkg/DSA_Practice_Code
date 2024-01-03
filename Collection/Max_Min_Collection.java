import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Max_Min_Collection {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(50);
        arrayList.add(23);
        arrayList.add(40);
        arrayList.add(8);

        Integer i = (int) arrayList.stream().count();
        List<Integer> list = arrayList.stream().map(e->e+5).collect(Collectors.toList());
        System.out.println("Number Of Count in Arraylist "+i);
        System.out.println("New ArrayList "+list);
        List<Integer> newList = arrayList.stream().filter(e->e%2==0).collect(Collectors.toList());
        List<Integer> sort = arrayList.stream().sorted((e1, e2)-> e2.compareTo(e1)).collect(Collectors.toList());
        System.out.println(newList);
        System.out.println(sort);
    }
}
