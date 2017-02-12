package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestJDBC {

    public static void main(String[] args) {
        PreparedStatement pre = null;
        ResultSet result = null;
        Connection con = null;

        try {
            con = getJDBCCon();
            String sql = "select * from student where name=?";// 预编译语句，“？”代表参数
            pre = con.prepareStatement(sql);
            pre.setString(1, "todo");

            result = pre.executeQuery();

            while (result.next()) {
                System.out.println(result);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (result != null) {
                    result.close();
                }
                if (pre != null) {
                    pre.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    private static Connection getJDBCCon() {
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:" + "thin:@127.0.0.1:1521:XE";// 127.0.0.1是本机地址，XE是精简版Oracle的默认数据库名
            String user = "todo";
            String passWord = "todo";
            con = DriverManager.getConnection(url, user, passWord);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

}
