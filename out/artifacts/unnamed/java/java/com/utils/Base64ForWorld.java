package java.com.utils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

/**
 * Created by admin on 2016/3/30.
 */
public class Base64ForWorld {

    private static String string = "hello good ";

    public static void main (String[] args){
        encoding("hello,world");
        decoder("aGVsbG8sd29ybGQ=");
    }
    //加密
    public static  String encoding(String info){
        BASE64Encoder encoder = new BASE64Encoder();
        String s = encoder.encode(info.getBytes());
       // System.out.println(s);
        return s ;
    }
    //解密
    public static void decoder(String info){
        try {
            BASE64Decoder decoder = new BASE64Decoder();
            byte[] b =  decoder.decodeBuffer(info);
          //  System.out.println(new String(decoder.decodeBuffer(info)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
