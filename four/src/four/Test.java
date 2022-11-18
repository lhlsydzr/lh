package four;

	public class Test {
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

		 public static void main(String[] args) {
		   String _18weekScoringList1[] = { "优", "优", "优", "优", "及格", "优", "优", "优", "良好", "优", "优", "优", "优", "优", "优", "优", "优", "优" };
		   String _18weekScoringList2[] = { "及格", "及格", "及格", "及格", "及格", "及格", "优", "及格", "及格", "良好", "及格", "及格", "及格","及格", "及格", "及格", "及格", "及格" };
		   String _18weekScoringList3[] = { "优", "及格", "及格", "及格", "优", "及格", "良好", "及格", "及格", "及格", "及格", "及格", "及格","优", "及格", "及格", "及格", "及格" };
		   String _18weekScoringList4[] = { "及格", "及格", "优", "及格", "及格", "优", "及格", "良好", "优", "及格", "优", "及格", "及格","及格", "优", "及格", "及格", "及格" };
		   String _18weekScoringList5[] = { "及格", "优", "及格", "及格", "及格", "及格", "优", "及格", "及格", "优", "及格", "及格", "及格", "及格", "及格", "及格", "及格", "不及格" }; 
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
		   System.out.println("张三税收前收入：" + ZhangSan.getmoneyEarned()); // 税收前收入
		   System.out.println("李四税收前收入：" + LiSi.getmoneyEarned());
		   System.out.println("王麻子税收前收入：" + Wangmazi.getmoneyEarned());
		   ZhangSan.setmoneyEarned(LatestNationalWageTaxStandard(ZhangSan.getmoneyEarned()));
		   LiSi.setmoneyEarned(LatestNationalWageTaxStandard(LiSi.getmoneyEarned()));
		   Wangmazi.setmoneyEarned(LatestNationalWageTaxStandard(Wangmazi.getmoneyEarned()));
		   System.out.println("张三税收后收入：" + ZhangSan.getmoneyEarned()); // 税收后收入
		   System.out.println("李四税收后收入：" + LiSi.getmoneyEarned());
		   System.out.println("王麻子税收后收入：" + Wangmazi.getmoneyEarned());
		 }

		}
