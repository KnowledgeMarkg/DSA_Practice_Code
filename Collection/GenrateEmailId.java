import java.util.Random;

public class GenrateEmailId {
    public static void main(String[] args) {
        String userName = genrateUserName();
        String domain = "example.com";
        String emailId = userName + "@" + domain;
        System.out.println("Email Id is : "+emailId);
    }

    private static String genrateUserName() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<6; i++){
            sb.append((char) (random.nextInt(26)+'a'));
        }
        sb.append(random.nextInt(10000));
        return sb.toString();
    }
}
