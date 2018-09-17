package com.example.demo.common.dto;

/**
 * Created by Rabbit on 2018/9/13.
 */
public class ResObject <Date>{
    private Integer code;
    private String desc;
    private Date date;

    public ResObject(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }


    public ResObject(Integer code, String desc, Date date) {
        this.code = code;
        this.desc = desc;
        this.date = date;
    }

    public ResObject(Integer code, Date date) {
        this.code = code;
        this.date = date;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
