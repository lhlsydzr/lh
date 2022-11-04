package experiment_3;

import java.util.*;

public class Subject {
    Scanner input = new Scanner(System.in);
    String[] su = { "大学物理  教学楼103   8:00-9:40 ", "体育     操场       10:00-11:40", "大学英语  图书馆301   8:00-9:40",
            "java    教学楼305   13:30-15:10", "线性代数  教学楼102   15:30-17:10", "化学     主楼2501   19:00-21:25",
            "离散数学  教学楼302   10:00-11:45", "会计     教学楼201   19:00-20:35", "马原     教学楼103   15:30-17:10" };// 静态初始化一维数组sub
    private String[] su1 = new String[4];
    private String[] su2 = new String[2];
    private String[] su3 = new String[1];

    public void setsu() { // 得到课表
        for (int i = 0; i < su.length; i++) {
            int j = i + 1;
            System.out.print("(" + j + ")");
            System.out.println(su[i]);
        }
    }

    // return su;}
    public void Kaike() { // 开课

        int i, a;
        for (i = 1; i <= 4; i++) {

            a = input.nextInt();
            su1[i - 1] = su[a - 1];
        }
    }

    public String[] getKaike() { // 得到开课课表
        String[] su11 = new String[this.su1.length];
        for (int i = 0; i < su1.length; i++) {

            su11[i] = su1[i];
        }
        return su11;
    }

    public void xuan() { // 选课
        for (int i = 1; i <= 2; i++) {
            int a = input.nextInt();
            su2[i - 1] = su1[a - 1];
        }

    }

    public String[] getxuan() { // 获得选课课表
        String[] su21 = new String[this.su2.length];
        for (int i = 0; i < su2.length; i++) {
            su21[i] = su2[i];
        }
        return su21;
    }

    public void tui() { // 退课

        System.out.println("请输入删除课程序号：");
        int j = input.nextInt();

        if (j == 1) {
            su3[0] = su2[1];
        }
        if (j == 2) {
            su3[0] = su2[0];
        }
    }

    public String[] gettui() { // 获得选课课表
        return su3;
    }
}
