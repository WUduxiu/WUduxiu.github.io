package com.study.huoserent房屋出租系统.view;

import com.study.huoserent房屋出租系统.domain.House;
import com.study.huoserent房屋出租系统.service.HouseService;
import com.study.huoserent房屋出租系统.utils.Utility;

import javax.naming.Name;
import java.time.Year;
import java.util.Scanner;

public class HouseView {
    String key = "";
    String answer = "";
    boolean loop = true;
    private HouseService houseService = new HouseService(5);
    //显示所有房屋信息
    public void listHouse(){
        System.out.println("---------------------房屋列表------------------------------");
        System.out.println("编号\t\t房主姓名\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House [] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i]==null){
                break;//停止本次循环
            }
            System.out.println(houses[i]);
        }
        System.out.println("---------------------房屋列表打印完成---------------------");
    }
    //添加房屋
    public void addHouse(){
        System.out.println("---------------------添加房屋----------------------");
        System.out.print("姓名：");
        String name = Utility.readString(10);
        System.out.print("电话：");
        String phone = Utility.readString(12);
        System.out.print("地址：");
        String address = Utility.readString(20);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态(未出租/已出租)：");
        String state = Utility.readString(3);
        //创建一个新的House对象，将这些信息传入对象中
        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newHouse)){
            System.out.println("---------------------添加房屋成功----------------------");
        }else {
            System.out.println("---------------------添加房屋失败----------------------");
        }
    }
    //删除房屋信息
    public void deleteHouse(){
        System.out.println("---------------------删除房屋信息----------------------");
        System.out.print("请输入待删除的房屋的编号(-1退出):");
        int delId = Utility.readInt();
        if (delId == -1){
            System.out.println("---------------------放弃删除房屋信息----------------------");
            return;//直接跳出该方法
        }
        //带有循环逻辑 必须输出Y/N
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y'){//表示真的删除
            if (houseService.delete(delId)){
                System.out.println("---------------------删除房屋信息成功----------------------");
            }else{
                System.out.println("-----------------房屋编号不存在，删除房屋信息失败----------------------");
            }
        }else {
            System.out.println("---------------------放弃删除房屋信息----------------------");
        }
    }
    //按编号查找房屋信息
    public void findHouse(){
        System.out.println("---------------------查找房屋----------------------");
        System.out.print("请输入你要查找的房屋编号：");
        int ID = Utility.readInt();
       House house = houseService.findById(ID);
       if (house!=null){
           System.out.println(house);
       }else {
           System.out.println("---------------------该房屋不存在----------------------");
       }
    }
    //修改房屋信息功能
    public void updateHouse(){
        System.out.print("请选择修改房屋编号(-1表示退出):");
        int updateId = Utility.readInt();
        if (updateId == -1){
            System.out.println("---------------------你放弃了修改房屋信息----------------------");
            return;
        }
        House house = houseService.findById(updateId);
        //返回的是引用类型  可以直接对其修改，修改的就是HouseService中的数组元素
        if (house == null){
            System.out.println("---------------------房屋信息不存在----------------------");
            return;
        }
        System.out.print("姓名("+house.getName()+"):");
        String newName = Utility.readString(10,"");//如果不修改直接回车  则表示不修改该信息
        if (!"".equals(newName)){
            house.setName(newName);
        }
        System.out.print("电话("+house.getPhone()+"):");
        String newPhone = Utility.readString(12,"");
        if (!"".equals(newName)){
            house.setPhone(newPhone);
        }
        System.out.print("地址("+house.getAddress()+"):");
        String newAddress = Utility.readString(20,"");
        if (!"".equals(newAddress)){
            house.setAddress(newAddress);
        }
        System.out.print("月租金("+house.getRent()+"):");
        int newRent = Utility.readInt(-1);
        if (-1!=newRent){
            house.setRent(newRent);
        }
        System.out.print("状态("+house.getState()+"):");
        String newState = Utility.readString(3,"");
        if (!"".equals(newState)){
            house.setState(newState);
        }
        System.out.println("---------------------房屋信息修改完成----------------------");

    }
    //退出功能
    public void exit(){
        char c = Utility.readConfirmSelection();
        if (c == 'Y'){
            loop = false;
        }
    }
    //主菜单页面
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n---------------------房屋出租系统----------------------");
            System.out.println("\t\t\t\t\t1 新增房源");
            System.out.println("\t\t\t\t\t2 查找房屋");
            System.out.println("\t\t\t\t\t3 删除房屋");
            System.out.println("\t\t\t\t\t4 修改房屋信息");
            System.out.println("\t\t\t\t\t5 房屋列表");
            System.out.println("\t\t\t\t\t6 退    出");
            System.out.print("请输入你的选项(1-6): ");
            key = scanner.next();
            switch (key) {
                case "1":
                    addHouse();
                    break;
                case "2":
                    findHouse();
                    break;
                case "3":
                    deleteHouse();
                    break;
                case "4":
                    updateHouse();
                    break;
                case "5":
                    listHouse();
                    break;
                case "6":
                    exit();
                    System.out.println("---------退出成功--------");
                    break;
                default:
                    System.out.println("输入的选项有误");

            }
        } while (loop);
    }

}

