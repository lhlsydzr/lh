package experiment_3;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student student;
		Teacher teacher;
		Subject subject = new Subject();
		system system;
		experiment_3.system.main(args);
		int ch = input.nextInt();
		if (ch == 1) {
			// teacher
			subject.setsu();
			// System.out.println(Arrays.toString(subject.getsu()));
			System.out.println("请输入开课序号（1~9）");
			subject.Kaike(); // 开课
			teacher = new Teacher("teacher1", 45, 1861171, "男", "清华");
			System.out.println("姓名：" + teacher.getName() + "   " + "年龄：" + teacher.getAge() + "   " + "编号："
					+ teacher.getBianhao() + "   " + "性别：" + teacher.getXingbie());
			System.out.println(Arrays.toString(subject.getKaike()));// 输出开课课表

			System.out.println("学生选课");
			// student
			System.out.println("输入选课课序号（1~4）");
			subject.xuan(); // 选课
			System.out.println(Arrays.toString(subject.getxuan())); // 输出选课课表
			System.out.println("学生退课");
			System.out.println("输入退课课序号（1~2）");
			subject.tui(); // 退课
			System.out.println(Arrays.toString(subject.gettui()));// 输出退课课表
			student = new Student("代赫", 20, 2020310864, "男", "HENAN");
			System.out.println("姓名：" + student.getName() + "   " + "年龄：" + student.getAge() + "   " + "编号："
					+ student.getBianhao() + "   " + "性别：" + student.getXingbie() + "   " + "授课老师：" + teacher.getName());
			/*
			 * System.out.println("输入退课课序号（1~2）"); subject.tui(); //退课
			 * System.out.println(Arrays.toString(subject.gettui()));//输出退课课表
			 */
		}
		if (ch == 0) {
			System.out.println("已退出");
			System.exit(0);
		}

	}
}