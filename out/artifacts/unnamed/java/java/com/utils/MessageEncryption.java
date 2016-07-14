package java.com.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageEncryption {
    public String getEncryption (String info){
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] bytes = info.getBytes();
            md5.update(bytes);
            byte[] byteResult = md5.digest();
            return  byteResult.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return  null;
        }

    }
}
