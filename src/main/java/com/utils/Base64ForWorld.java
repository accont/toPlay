package com.utils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

/**
 * Created by admin on 2016/3/30.
 */
public class Base64ForWorld {

    private static String string = "hello good ";

    public static void main (String[] args){

    }
    //加密
    public static  String encoding(String info){
        BASE64Encoder encoder = new BASE64Encoder();
        String s = encoder.encode(info.getBytes());
       // System.out.println(s);
        return s ;
    }
    //解密
    public static String decoder(String info) throws IOException {
            BASE64Decoder decoder = new BASE64Decoder();
            byte[] b =  decoder.decodeBuffer(info);
          //  System.out.println(new String(decoder.decodeBuffer(info)));
            return new String(decoder.decodeBuffer(info));
    }

}
