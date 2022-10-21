package StuPickCouse_Dos.PickMysql;

import StuPickCouse_Dos.PickCouse.User;

import javax.swing.*;
import java.sql.*;

public class UserSql {
    Connection con=null;
    Statement sql;
    ResultSet rs;
    public UserSql(){}
    void star(){
        String url="jdbc:mysql://localhost:3306/couse?user=root&password=&useSSL=true&useUnicode=true&characterEncoding=utf-8";
        String user="root";
        String passKey="";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            con= DriverManager.getConnection(url,user,passKey);
        }
        catch(SQLException e){
            System.out.println(e);
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public User getUser(String id){
        User user=new User();
        star();
        try {
            sql=con.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            rs=sql.executeQuery("select * from User where id="+id);
            while(rs.next()){
                user.setId(id);
                user.setName(rs.getString(2));
                user.setSex(rs.getString(3));
                user.setPross(rs.getString(4));
            }
            rs.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return user;
    }
    public String findUser(String id){
        String user="";
        star();
        try {
            sql=con.createStatement();
        } catch (SQLException throwables) {
//            throwables.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "数据库无法连接！",
                    "登录失败",
                    JOptionPane.ERROR_MESSAGE);
        }
        try {
            rs=sql.executeQuery("select pwd from Login where id="+id);
            while(rs.next()){
                user=rs.getString(1);
            }
            rs.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return user.equals("")?null:user;
    }
}

