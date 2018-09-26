package com.coolzhul.common.util;

/**
 * StringUtil String的工具类
 * @javaName StringUtil
 * @Date 2018.02.15
 * @author hezw
 * @version 1.0
 */
public class StringUtil {
    public boolean isNull(String str){
        if(str==null||"".equals(str)){
            return true;
        }else{
            return false;
        }
    }
}
