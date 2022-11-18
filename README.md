# 实验四 学生实验室勤工俭学模拟

#### 介绍

学生实验室勤工俭学模拟

#### 目的

掌握java中类的定义；  
掌握static、final等修饰符的用法；  
了解异常的使用方法，并在程序中根据输入情况做异常处理  


#### 实验内容

某学校为了给学生提供動工俭学机会,选派了部分学生参与实验室的卫生清洁工作。每个学生被分配着干间实验室,视实验室的清洁打分情况给予劳务补贴。  

#### 实验要求

1.设计系统中的类(如学生、实验等等)  
2.一学期按18周计。  
3.每个学生负责的实验数量不一定相同。  
4.对学期勒工俭学收入和纳税进行统计，求得实际收入。  
5.国家最新纳税标准(系数)属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用staticfinal修饰定义。  
6.根据处理情况，要在程序中考虑做异常处理。

#### 主要代码

```
public Experiment(int ExperimentNumber, String ExperimentName, String[] CleanlinessScore) {
		  this.ExperimentNumber = ExperimentNumber;
		  this.ExperimentName = ExperimentName;
		  this.CleanlinessScore = CleanlinessScore;
		 }
		 public int getExperimentNumber() {
		  return ExperimentNumber;
		 }
		 public String getExperimentName() {
		  return ExperimentName;
		 }
		 public String[] getCleanlinessScore() {
		  return CleanlinessScore;
		 }
		 public int setExperimentNumber(int ExperimentNumber) {
		  this.ExperimentNumber = ExperimentNumber;
		  return ExperimentNumber;
		 }
		  public String setExperimentName(String ExperimentName) {
		   this.ExperimentName = ExperimentName;
		   return ExperimentName;
		  }
		  public String[] setCleanlinessScore(String[] CleanlinessScore) {
		   this.CleanlinessScore = CleanlinessScore;
		   return CleanlinessScore;
		  }
		 }
```
```
static double LatestNationalWageTaxStandard(double money) {
		  double TaxReceivable = 0;
		  if (0 <= money && money <= 5000) {
		   TaxReceivable = 0;
		  }
		   if (5000 < money && money <= 8000) {
		    TaxReceivable = money * 0.03;
		    }
		   if (8000 < money && money <= 17000) {
		    TaxReceivable = money * 0.10;
		   }
		   if (17000 < money && money <= 30000) {
		    TaxReceivable = money * 0.20;
		   }
		   if (30000 < money && money <= 40000) {
		    TaxReceivable = money * 0.25;
		   }
		   final double TaxReceivable1 = TaxReceivable;
		   return TaxReceivable1;
		 }
```
```
Experiment ModelingExperiment = new Experiment(1, "建模实验室", _18weekScoringList1);
		   Experiment ComputerExperiment = new Experiment(2, "计算机实验室", _18weekScoringList2);
		   Experiment CollegePhysicsExperiment = new Experiment(3, "大学物理实验室", _18weekScoringList3);
		   Experiment ChemicalExperiment = new Experiment(4, "化学实验室", _18weekScoringList4);
		   Experiment BiologyExperiment = new Experiment(5, "生物实验室", _18weekScoringList5);
		   Experiment moren1[] = new Experiment[2];
		   Experiment moren2[] = new Experiment[3];
		   Experiment moren3[] = new Experiment[3];
		   Student ZhangSan = new Student(1, "张三", moren1, 0);
		   Student LiSi = new Student(2, "李四", moren2, 0);
		   Student Wangmazi = new Student(3,"王麻子",moren3,0);
		   ZhangSan.setexperiment(0, moren1, ModelingExperiment);
		   ZhangSan.setexperiment(1, moren1, ComputerExperiment);
		   LiSi.setexperiment(0, moren2, CollegePhysicsExperiment);
		   LiSi.setexperiment(1, moren2, ChemicalExperiment);
		   Wangmazi.setexperiment(0, moren3, BiologyExperiment);
		   ZhangSan.WorkStudyIncome(ModelingExperiment.getCleanlinessScore(), ZhangSan);
		   ZhangSan.WorkStudyIncome(ComputerExperiment.getCleanlinessScore(), ZhangSan);
		   LiSi.WorkStudyIncome(CollegePhysicsExperiment.getCleanlinessScore(), LiSi);
		   LiSi.WorkStudyIncome(ChemicalExperiment.getCleanlinessScore(), LiSi);
		   Wangmazi.WorkStudyIncome(BiologyExperiment.getCleanlinessScore(), Wangmazi);
		   
```

```
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
```


