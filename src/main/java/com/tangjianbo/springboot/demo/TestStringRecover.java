package com.tangjianbo.springboot.demo;

public class TestStringRecover {
    public static void main(String[] args) {
        String s = "123456";
       /* char[] chars = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            builder.append(chars[i]);
        }
        System.out.println(builder.toString());*/
        StringBuilder stringBuilder = new StringBuilder(s);
        System.out.println(stringBuilder.reverse().toString());
    }
}
