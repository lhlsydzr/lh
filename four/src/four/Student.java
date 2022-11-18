package four;

	public class Student {
		 private int number;
		 private String name;
		 private Experiment[] experiment1;
		 private double moneyEarned;
		 public Student(int number, String name, Experiment[] experiment1, double moneyEarned) {
		  this.number = number;
		  this.name = name;
		  this.experiment1 = experiment1;
		  this.moneyEarned = moneyEarned;
		 }
		 public int getnumber() {
		  return number;
		 }
		 public String getname() {
		  return name;
		 }
		 public Experiment[] getexperiment() {
		  return experiment1;
		 }
		 public double getmoneyEarned() {
		  return moneyEarned;
		 }
		 public int setStudentnumber(int number) {
		  this.number = number;
		  return number;
		 }
		 public String name(String name) {
		  this.name = name;
		  return name;
		 }
		 public Experiment[] setexperiment(int N, Experiment[] experiment1, Experiment experiment2) {
		  this.experiment1[N] = experiment2;
		  return experiment1;
		 }
		 public double setmoneyEarned(double moneyEarned) {
		  this.moneyEarned += moneyEarned;
		  return moneyEarned;
		 }
		 public void WorkStudyIncome(String[] List1, Student studnt ) {
		  for (int t = 0; t < 18; t++) {
		   if (List1[t] == "优") {
		    studnt.setmoneyEarned(200);
		   }
		   if (List1[t] == "及格") {
		    studnt.setmoneyEarned(120);
		   }
		   if (List1[t] == "不及格") {
		    studnt.setmoneyEarned(0);
		   }
		   if (List1[t] == "良好") {
			   studnt.setmoneyEarned(80); 
		   }
		  }
		 }
		  
		}
