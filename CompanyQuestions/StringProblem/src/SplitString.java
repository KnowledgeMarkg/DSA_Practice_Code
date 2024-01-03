import java.util.regex.Pattern;
import java.util.*;
import java.util.stream.Collectors;

public class SplitString {
    public static void main(String[] args) {
        String st = "Kausar-Raza-Ansari";
        String[] stArr = st.split("-");
        splitString(stArr);

        List<String> sList = Pattern.compile("-").splitAsStream(st).collect(Collectors.toList());

        for (String stArr1 : sList){
            System.out.println(stArr1);
        }
    }

    private static void splitString(String[] stArr) {
        for (String str : stArr) {
            System.out.println(str);
        }
    }
}
