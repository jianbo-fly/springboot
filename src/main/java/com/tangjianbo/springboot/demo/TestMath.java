package com.tangjianbo.springboot.demo;

public class TestMath {
    public static void main(String[] args) {
        Long a = Math.round(-1.6);
        System.out.println(a);
        Long a1 = Math.round(-1.5);
        System.out.println(a1);
        Long an = Math.round(-1.4);
        System.out.println(an);
        Long a2 = Math.round(1.6);
        System.out.println(a2);
        Long a3 = Math.round(1.5);
        System.out.println(a3);
    }
}
