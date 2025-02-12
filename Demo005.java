
public class Demo005 {
    public static void main(String[] args) {
        // verify user credentials username = user001 pwd = user_001
        String username = "user001";
        String password = "user_001";

        while ((username == "user001") && (password == "user_001")) {
            System.out.println("hello user happy new year");
            break;
        }
    }
}
