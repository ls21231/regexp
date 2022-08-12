package com.ls.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ls
 * @create 2022 -- 05 -- 08
 */
public class RegExp01 {
    //转义字符
    //特别注意的是，java中连个 \\ 代表其他语言正则表达式的一个 \
    //需要转义的字符：. * + ( ) $ / \ ? { } [ ] ^
    public static void main(String[] args) {
        String str = "123$abc(.)";
        Pattern compile = Pattern.compile("\\$");
        Matcher matcher = compile.matcher(str);
        while (matcher.find()) {
            System.out.println("找到: " + matcher.group(0));
        }
    }
}
