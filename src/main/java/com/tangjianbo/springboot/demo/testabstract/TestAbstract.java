package com.tangjianbo.springboot.demo.testabstract;

public abstract class TestAbstract {
    public TestAbstract(){}
    public abstract String getName();

    public String getParentName(String s) {
        return s;
    }
}
