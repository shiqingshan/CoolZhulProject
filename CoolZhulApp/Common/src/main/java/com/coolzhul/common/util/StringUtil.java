package com.coolzhul.common.util;

/**
 * StringUtil String的工具类
 * @deprecated 工具类
 * @since 2018.09.26
 * @author hezw
 * @version 1.0
 */
public class StringUtil {
    public static boolean isNull(String str){
       return str==null||str.length()==0;
    }

    public static boolean isBlank(String str){
        return str==null||str.trim().length()==0;
    }

}
