package experiment_3;

import experiment_3_new.People;

class Student extends People {
    private String Home;

    Student(String n, int cage, int b, String x, String h) {
        super(n, cage, b, x);
        Home = h;
    }

    public String getHome() {
        return Home;
    }
}