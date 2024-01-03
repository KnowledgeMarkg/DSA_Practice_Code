import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SreamAPI {
    public static void main(String[] args) {
        ArrayList<Integer> arlist = new ArrayList<>();
        for(int i=0; i<=10; i++){
            arlist.add(i);
        }
        List<Integer> evenList = arlist.stream().filter(e-> e%2 ==0 && e!=0).collect(Collectors.toList());
        System.out.println(evenList);
    }
}
