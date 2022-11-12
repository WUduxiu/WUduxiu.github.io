package com.bjpowernode.spring6.bean;

/**
 * @date 2022/10/28&22:33
 */
public class Girls {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Girls{" +
                "name='" + name + '\'' +
                '}';
    }
}
