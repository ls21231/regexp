package com.ls.regexp;


import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ls
 * @create 2022 -- 05 -- 08
 */
public class RegTheory {
    public static void main(String[] args) {
        String content = "12345678哈哈哈哈";
        Pattern compile = Pattern.compile("(?<onezu>\\d\\d)(\\d\\d)");
        Matcher matcher = compile.matcher(content);
        while (matcher.find()){
            System.out.println("找到：" + matcher.group(0));
            System.out.println("找到：" + matcher.group("onezu"));
            System.out.println("找到：" + matcher.group(2));
        }

    }


    @Test
    public void test() {
        //String content = "hanshunping sphan nnhan";
        String content = "ha 1jas-ac jb";
        //String content = "123-abc";
        //以至少1个数字开头，后接任意个小写字母的字符串
        //String regStr = "^[0-9]+[a-z]*";
        //以至少1个数字开头, 必须以至少一个小写字母结束
        String regStr = "^[0-9]+\\-[a-z]+$";

        //表示匹配边界的han[这里的边界是指：被匹配的字符串最后,
        // 也可以是空格的子字符串的后面]
        //String regStr = "han\\b";

        //和\\b的含义刚刚相反
        //String regStr = "han\\B";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到=" + matcher.group(0));
        }
    }

}
