package com.zq.filesystem.utils;

import java.util.Random;

/**
 * @author zhouqi
 * @desc
 * @data 2020/9/23
 */
public class KeyUtil {
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer num = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(num);
    }
}
