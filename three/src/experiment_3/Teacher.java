package experiment_3;

import experiment_3_new.People;

class Teacher extends People {
    private String School;

    Teacher(String n, int cage, int b, String x, String s) {
        super(n, cage, b, x);
        School = s;
    }

    public String getSchool() {
        return School;
    }
}