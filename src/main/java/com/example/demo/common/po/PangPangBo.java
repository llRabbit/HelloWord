package com.example.demo.common.po;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;


/**
 * Created by Rabbit on 2018/9/17.
 */
public class PangPangBo implements Serializable{

    @ApiModelProperty(value = "姓名" ,dataType="query")
    private String name;
    @ApiModelProperty(value = "年龄",name = "age",allowableValues = "a,v,c")
    private int age;

    public PangPangBo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
