package com.example.demo.common.po;

/**
 * Created by Rabbit on 2018/9/14.
 */
public class ShuaiShuaiLin {
    private String name;
    private int age;

    public ShuaiShuaiLin(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public ShuaiShuaiLin() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
