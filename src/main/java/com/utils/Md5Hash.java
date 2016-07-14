package com.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Created by admin on 2016/4/11.
 */
public class Md5Hash {

    public static String md5(String s){
        return DigestUtils.md5Hex(s);
    }
}
