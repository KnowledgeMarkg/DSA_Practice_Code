import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student{
    private int id;
    private String stdName;

    public Student(int id , String stdName){
        this.id = id;
        this.stdName = stdName;
    }

    public int  getId(){
         return this.id;
    }

    public String getName(){
        return this.stdName;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", stdName=" + stdName + "]";
    }
    
}
public class SortObject {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i =0; i<4; i++){
        int id = sc.nextInt();
        String stdName = sc.next();
        students.add(new Student(id, stdName));
        }
        Collections.sort(students, (i1, i2)-> (i1.getId() > i2.getId()) ? -1 :(i1.getId() < i2.getId()) ? 1 : 0);
        System.out.println(students);
        Collections.sort(students, (i1, i2)-> (i1.getId() < i2.getId()) ? -1 :(i1.getId() > i2.getId()) ? 1 : 0);
        System.out.println(students);
        sc.close();
    }
}
