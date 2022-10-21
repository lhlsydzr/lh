package StuPickCouse_Dos.PickMysql;

import StuPickCouse_Dos.PickCouse.Couse;
import StuPickCouse_Dos.PickCouse.User;

import java.sql.*;
import java.util.ArrayList;

public class CouseSql {
    User user;

    public CouseSql(User user){
        this.user=user;
    }

    Connection con=null;
    Statement sql;
    ResultSet rs;
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

    public ArrayList<Couse> findCouse(String sqlLine){
        ArrayList<Couse> couses=new ArrayList<>();
        star();
        try {
            sql=con.createStatement();//
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            rs = sql.executeQuery(sqlLine);
            while (rs.next()) {
                couses.add(new Couse(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)
                ));
            }
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return couses;
    }
    public boolean isMyCouse(String sqlLine){
        boolean couses=false;
        star();
        try {
            sql=con.createStatement();//
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            rs = sql.executeQuery(sqlLine);
            while (rs.next()) {
                couses=true;
            }
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return couses;
    }
    public void chioseCouse(Couse couse) {
        star();
        try {
            sql=con.createStatement();//
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            sql.executeUpdate("update Subject set Noss=Noss+1 where subjectId="+couse.getId());
            sql.executeUpdate("INSERT INTO PickCouse VALUES ('"+this.user.getId()+"','"+couse.getId()+"')");
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println("====>Ìí¼Ó³É¹¦£¡");
    }

    public void addCouse(String id,String name,int x1,int x2,String tec) throws Exception{
        star();
        sql=con.createStatement();
        sql.executeUpdate("INSERT INTO Subject VALUES (\""+id+"\",\""+name+"\","+x1+","+x2+",\""+tec+"\")");
        con.close();
    }

}

