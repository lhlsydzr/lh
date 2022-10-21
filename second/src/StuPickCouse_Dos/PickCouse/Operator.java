package StuPickCouse_Dos;

import StuPickCouse_Dos.PickCouse.Couse;
import StuPickCouse_Dos.PickCouse.User;
import StuPickCouse_Dos.PickMysql.CouseSql;
import StuPickCouse_Dos.PickMysql.UserSql;

import java.util.ArrayList;
import java.util.Scanner;

public class Operator {
    User user;
    CouseSql couseSql;
    UserSql userSql;
    ArrayList<Couse> couses = new ArrayList<>();

    public void setUser(User user) {
        this.user = user;
    }

    public Operator(){}
    public Operator(User user) {
        this.user = user;
        couseSql=new CouseSql(user);
        userSql=new UserSql();
    }
    public void findAllCouse(){
        couses = couseSql.findCouse("select * from Subject");
        for (int i = 0; i < couses.size(); i++)
            System.out.println((i + 1) + "  " + couses.get(i).toString());
    }
    public void selectCouse(){
        System.out.println("所有课程如下：");
        ArrayList<Couse> couseICanChose=new ArrayList<>();
        ArrayList<String> couseICanChoseId=new ArrayList<>();
        for (int i = 0; i < couses.size(); i++){
            System.out.print((i + 1) + "  " + couses.get(i).toString());
            boolean tag=false,flage=false;
            System.out.println( ( tag= ( ( !(flage=couseSql.isMyCouse("select * from PickCouse where stuId="+user.getId()+" and couseId="+couses.get(i).getId() )
            )&& Integer.parseInt( couses.get(i).getCapacity() )
                    >= Integer.parseInt( couses.get(i).getNum() ) ) ) )? "  可选": flage?"    已选":"   人员已满");
            if(tag) {
                couseICanChose.add(couses.get(i));
                couseICanChoseId.add(couses.get(i).getId());
            }
        }
        if(couseICanChose.size() < 1)
            System.out.print("暂时没有可选的课程！");
        else {
            System.out.println("====》可选课程有：");
            for (int i = 0; i < couseICanChose.size(); i++)
                System.out.println((i + 1) + "  " + couseICanChose.get(i).toString());
            System.out.print("====>请输入选择的课程编号：");
            String couse = "";
            while(!couseICanChoseId.contains( couse = (new Scanner(System.in)).nextLine()))
                System.out.print("输入不在选择范围，请重新输入：");
            couseSql.chioseCouse(new Couse(couse));
        }
    }
    public void findMyCouse(){
        shoeArrayList(couseSql.findCouse("select * from Subject where subjectId in (select couseId from PickCouse where stuId="+user.getId()+")"));
    }
    public static void shoeArrayList(ArrayList<Couse> item){
        for (int i = 0; i < item.size(); i++)
            System.out.println((i + 1) + "  " + item.get(i).toString());
        System.out.print("Tip: 按任意键继续：");
        (new Scanner(System.in)).next();
    }
    public boolean intoPwd(String pwd,String id){
        int inputTimes=2;
        while( !( userSql.findUser(id).equals((new Scanner(System.in)).nextLine()) )&&inputTimes>0)
            System.out.print("！[第"+(3-inputTimes)+"次输入]-密码输入错误：剩余输入机会"+(inputTimes--)+"\n请重新输入：");
        return inputTimes>=0;
    }
    public int show(){
        System.out.println("*****************************************");
        System.out.println("*****************************************");
        System.out.println("********   1)查看课程信息   **************");
        System.out.println("********   2)选课           *************");
        System.out.println("********   3)查看个人选课    *************");
        System.out.println("*****************************************");
        System.out.print("请输入选择：");
        return (new Scanner(System.in)).nextInt();
    }
}

