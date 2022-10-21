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
        System.out.println("���пγ����£�");
        ArrayList<Couse> couseICanChose=new ArrayList<>();
        ArrayList<String> couseICanChoseId=new ArrayList<>();
        for (int i = 0; i < couses.size(); i++){
            System.out.print((i + 1) + "  " + couses.get(i).toString());
            boolean tag=false,flage=false;
            System.out.println( ( tag= ( ( !(flage=couseSql.isMyCouse("select * from PickCouse where stuId="+user.getId()+" and couseId="+couses.get(i).getId() )
            )&& Integer.parseInt( couses.get(i).getCapacity() )
                    >= Integer.parseInt( couses.get(i).getNum() ) ) ) )? "  ��ѡ": flage?"    ��ѡ":"   ��Ա����");
            if(tag) {
                couseICanChose.add(couses.get(i));
                couseICanChoseId.add(couses.get(i).getId());
            }
        }
        if(couseICanChose.size() < 1)
            System.out.print("��ʱû�п�ѡ�Ŀγ̣�");
        else {
            System.out.println("====����ѡ�γ��У�");
            for (int i = 0; i < couseICanChose.size(); i++)
                System.out.println((i + 1) + "  " + couseICanChose.get(i).toString());
            System.out.print("====>������ѡ��Ŀγ̱�ţ�");
            String couse = "";
            while(!couseICanChoseId.contains( couse = (new Scanner(System.in)).nextLine()))
                System.out.print("���벻��ѡ��Χ�����������룺");
            couseSql.chioseCouse(new Couse(couse));
        }
    }
    public void findMyCouse(){
        shoeArrayList(couseSql.findCouse("select * from Subject where subjectId in (select couseId from PickCouse where stuId="+user.getId()+")"));
    }
    public static void shoeArrayList(ArrayList<Couse> item){
        for (int i = 0; i < item.size(); i++)
            System.out.println((i + 1) + "  " + item.get(i).toString());
        System.out.print("Tip: �������������");
        (new Scanner(System.in)).next();
    }
    public boolean intoPwd(String pwd,String id){
        int inputTimes=2;
        while( !( userSql.findUser(id).equals((new Scanner(System.in)).nextLine()) )&&inputTimes>0)
            System.out.print("��[��"+(3-inputTimes)+"������]-�����������ʣ���������"+(inputTimes--)+"\n���������룺");
        return inputTimes>=0;
    }
    public int show(){
        System.out.println("*****************************************");
        System.out.println("*****************************************");
        System.out.println("********   1)�鿴�γ���Ϣ   **************");
        System.out.println("********   2)ѡ��           *************");
        System.out.println("********   3)�鿴����ѡ��    *************");
        System.out.println("*****************************************");
        System.out.print("������ѡ��");
        return (new Scanner(System.in)).nextInt();
    }
}

