package JavaTeachings;

import java.util.Base64;

public class EncryptedPassword {
    public static void main(String[] args) {
        String password = "Admin@123";
        byte b[] = password.getBytes();
        String encryptedPassword = Base64.getEncoder().encodeToString(b);
        System.out.println(encryptedPassword);
    }
}
