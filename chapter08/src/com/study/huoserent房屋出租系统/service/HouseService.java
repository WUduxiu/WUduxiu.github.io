package com.study.huoserent房屋出租系统.service;

import com.study.huoserent房屋出租系统.domain.House;

import java.awt.*;

/*
 业务层
 定义House[]，保存House对象
 1.响应HouseView的调用
 2.完成对房屋信息的增删查改  c u r d
 */
public class HouseService {
    private House [] houses;
    private int houseNums = 1 ;//记录当前有多少个房屋信息 默认值给1 因为初始化了一个对象
    private int idCounter = 1;//记录当前的id增长到了什么值
    public HouseService(int size){
        houses = new House[size];//当创建对象时，设定初始房屋数量
        //设定初始值 配合测试
        houses[0] = new House(1,"jack","112","A区",1000,"未出租");
    }
    public House[] list(){
        return houses;
    }
    //添加房屋方法，并且返回boolean值判断是否成功
    public boolean add(House newHouse){
        //先判断是否还可以添加
        if (houseNums == houses.length){//表示无法再添加
            House [] addHouse = new House[houses.length+1];
            for (int i = 0; i < addHouse.length-1; i++) {
                    addHouse[i] = houses[i];
            }
                    houses = addHouse;
            return true;
        }
        //因为原本存在初始化的对象 数组下标为0 houesNums默认值为1 此时加入到数组中下标为1 正好对应初始值的后一位
        houses[houseNums++]=newHouse;
        //相当于  houseNums++表示新增加了一个房屋信息  写到一起是因为后++ 先传值后自增
        //id自增长机制
        //相当于 idCounter++;  前++先自增后传值
        newHouse.setId(++idCounter);
        return true;
    }
    //删除房屋信息
    public boolean delete(int delId){
        //应当先找到要删除的房屋信息（即房屋数组里面对应的的下标）
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()){//表示删除的房屋编号和 房屋属性对应成功
                 index = i;//找到有对应的房屋信息 就用index来记录 下标i
            }
        }
        if (index==-1){
            //表示没有找到对应的房屋信息
            return false;
        }
        for (int i = index; i <houseNums-1 ; i++) {//houseNums-1 表示存入数组中的房屋信息的编号 是比数组下标大1的
                                                    //即存入的房屋信息数组长度+1 所以要-1
                                                    //这样保证不会空指针异常（即 null = null）
                houses[i] = houses[i+1];
        }
        houses[--houseNums]=null;//前--  先自减  后赋值
        /*
        相当于
        houses[houseNums-1]=null;
        houseNums--;
         */
        return true;
    }
    //按编号查找房屋信息
    public House findById(int ID){
        for (int i = 0; i < houseNums; i++) {
                if (ID==houses[i].getId()){
                   return houses[i];
                }
        }
        return null;
    }
}
