package four;

public class Experiment {
		 private String ExperimentName;
		 private int ExperimentNumber;
		 private String[] CleanlinessScore;
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
