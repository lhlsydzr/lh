package StuPickCouse_Dos;

import StuPickCouse_Dos.PickCouse.User;
import StuPickCouse_Dos.PickMysql.UserSql;
import java.util.Scanner;

public class Demo_1 {
    public static void main(String[] args) throws Exception {
        System.out.println("*****************************************");
        System.out.println("********   ѧ��ѡ�ι���-��¼   ***********");
        System.out.println("*****************************************");
        User user= new User();
        System.out.print("===���������˺ţ�");
        String id="";
        int inputTimes=1;
        while(!(id=(new Scanner(System.in)).nextLine()).matches("[0-9]{9}"))
            System.out.print("��[��"+(inputTimes++)+"������]��������û��˺�Ϊ���ѧ��\n���������룺");
        System.out.print("====>���������룺");
        if((new Operator()).intoPwd("",(user=(new UserSql()).getUser(id)).getId())){
            System.out.println("�û���"+user.getName()+"����ӭ��¼��");
            while((inputTimes=(new Operator()).show())> 0 ) {
                switch (inputTimes) {
                    case 1:(new Operator(user)).findAllCouse();break;
                    case 2:(new Operator(user)).selectCouse();break;
                    case 3:(new Operator(user)).findMyCouse();break;
//                    case 99:addCouse(new CouseSql(user));break;
                    default:return;
                }
                System.out.print("��������������˵���");
                (new Scanner(System.in)).next();
            }
        }
        else{
            System.out.println("��¼ʧ�ܣ������µ�¼��");
            main(args);
        }
    }
//    public static void addCouse(CouseSql sql) throws Exception{
//        System.out.print("1)������γ̱�ţ�");
//        String id=(new Scanner(System.in)).nextLine();
//        System.out.print("2)������γ����ƣ�");
//        String name=(new Scanner(System.in)).nextLine();
//        System.out.print("3)��������ѡ��������");
//        int noss=(new Scanner(System.in)).nextInt();
//        System.out.print("4)������γ�ѡ��������");
//        int cap=(new Scanner(System.in)).nextInt();
//        System.out.print("5)������γ̽�ʦ������");
//        String tec=(new Scanner(System.in)).nextLine();
//        sql.addCouse(id,name,noss,cap,tec);
//        System.out.println("======����ӳɹ���");
//        System.out.print("���������밴1���˳���������:");
//        if((new Scanner(System.in)).nextLine()=="1"){
//            addCouse(sql);
//        }
//    }
}

