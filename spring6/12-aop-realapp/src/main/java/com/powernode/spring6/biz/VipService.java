package com.powernode.spring6.biz;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @date 2022/11/4&22:53
 */
@Service
public class VipService {
    public void saveVip() {
        System.out.println("新增Vip用户信息");
    }

    public void deleteVip() {
        System.out.println("删除Vip用户信息");
    }

    public void modifyVip() {
        System.out.println("修改Vip用户信息");
    }

    public void getVip() {
        System.out.println("获取Vip用户信息");
    }
}
