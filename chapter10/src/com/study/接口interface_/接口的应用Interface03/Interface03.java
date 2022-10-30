package com.study.接口interface_.接口的应用Interface03;

public class Interface03 {
    public static void main(String[] args) {
        Interface03 interface03 = new Interface03();
        MySqlDB mySqlDB = new MySqlDB();
        OracleDB oracleDB = new OracleDB();
        interface03.test(mySqlDB);
        interface03.test(oracleDB);
    }
    public void test(InterfaceDB db){
        db.connect();
        db.close();
    }
}
