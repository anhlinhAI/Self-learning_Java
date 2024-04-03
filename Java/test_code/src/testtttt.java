
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PC
 */
public class testtttt {

    public static boolean checkContinue(String decision) {
        String regex = "^[Y,N]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(decision);
        if (matcher.find()) {
            return true;
        } else {
            System.out.println("Input invalid, Please input 'Y' or 'N'");
        }
        return false;
    }

    public String Encrypt(String pass) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(pass.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(hash);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Encrypt failled!");
            return null;
        }
    }
}
