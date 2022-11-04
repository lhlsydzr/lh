# 实验三继承关系

#### 一 实验目的
1.掌握权限访问控制修饰符的使用；
2.掌握继承的使用。
#### 二 业务要求
保持实验二的代码和readme版本不变；
新建代码仓库，在实验二代码的基础上完成本次实验；
业务过程同实验二，但在类的设计上，采用父类-子类的继承关系定义。
测试实体类分别存放于不同的package中，验证权限访问控制、继承后属性及方法的可见性。

#### 三 实验要求
1.提交源程序到gitee或github，代码仓库命名为“实验三继承关系”
2.写实验报告文件（readme.md），体现本次实验在实验二基础上的改进


#### 四 实验步骤

1. 把Student还有Teacher作为子类，People作为父类
```
public class Student extends People
public class Teacher extends People
```
2.Teacher类里添加独有的属性home
```
 private String Home;

    Student(String n, int cage, int b, String x, String h) {
        super(n, cage, b, x);
        Home = h;
    }
```
3.super继承
```
Student(String n, int cage, int b, String x, String h) {
        super(n, cage, b, x);
        Home = h;
    }
```
4.输出Teacher的独有属性
```
public void openCourse(Teacher teacher, int n, Course course1,int age) { // 开课方法
        teacher.course[n] = course1;
        System.out.println(teacher.name + "开设" + teacher.course[n].coursename + "教龄："+ teacher.age +"课程成功");
    }
```
#### 五 流程图
![](https://images.gitee.com/uploads/images/2021/1118/195019_6d76c055_9898764.png "屏幕截图.png")

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request


#### 六 实验感想

1.掌握了继承的方法，extends继承和用super访问父类