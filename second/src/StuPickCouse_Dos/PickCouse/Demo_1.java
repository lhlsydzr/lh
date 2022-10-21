package StuPickCouse_Dos;

import StuPickCouse_Dos.PickCouse.User;
import StuPickCouse_Dos.PickMysql.UserSql;
import java.util.Scanner;

public class Demo_1 {
    public static void main(String[] args) throws Exception {
        System.out.println("*****************************************");
        System.out.println("********   学生选课管理-登录   ***********");
        System.out.println("*****************************************");
        User user= new User();
        System.out.print("===》请输入账号：");
        String id="";
        int inputTimes=1;
        while(!(id=(new Scanner(System.in)).nextLine()).matches("[0-9]{9}"))
            System.out.print("！[第"+(inputTimes++)+"次输入]输入错误：用户账号为你的学号\n请重新输入：");
        System.out.print("====>请输入密码：");
        if((new Operator()).intoPwd("",(user=(new UserSql()).getUser(id)).getId())){
            System.out.println("用户："+user.getName()+"，欢迎登录！");
            while((inputTimes=(new Operator()).show())> 0 ) {
                switch (inputTimes) {
                    case 1:(new Operator(user)).findAllCouse();break;
                    case 2:(new Operator(user)).selectCouse();break;
                    case 3:(new Operator(user)).findMyCouse();break;
//                    case 99:addCouse(new CouseSql(user));break;
                    default:return;
                }
                System.out.print("按任意键返回主菜单：");
                (new Scanner(System.in)).next();
            }
        }
        else{
            System.out.println("登录失败！请重新登录！");
            main(args);
        }
    }
//    public static void addCouse(CouseSql sql) throws Exception{
//        System.out.print("1)请输入课程编号：");
//        String id=(new Scanner(System.in)).nextLine();
//        System.out.print("2)请输入课程名称：");
//        String name=(new Scanner(System.in)).nextLine();
//        System.out.print("3)请输入已选课人数：");
//        int noss=(new Scanner(System.in)).nextInt();
//        System.out.print("4)请输入课程选课容量：");
//        int cap=(new Scanner(System.in)).nextInt();
//        System.out.print("5)请输入课程教师姓名：");
//        String tec=(new Scanner(System.in)).nextLine();
//        sql.addCouse(id,name,noss,cap,tec);
//        System.out.println("======》添加成功！");
//        System.out.print("继续输入请按1，退出按其他键:");
//        if((new Scanner(System.in)).nextLine()=="1"){
//            addCouse(sql);
//        }
//    }
}

