package experiment_3_new;

public class People {
    int i;
    private int Age;
    private String Name;
    private int Bianhao;
    private String Kecheng;
    private String Xingbie;

    public People(String n, int cage, int b, String x) {
        Name = n;
        Age = cage;
        Bianhao = b;
        Xingbie = x;
    }

    public int getAge() {
        return Age;
    }

    public String getName() {
        return Name;
    }

    public int getBianhao() {
        return Bianhao;
    }

    public String getKecheng() {
        return Kecheng;
    }

    public String getXingbie() {
        return Xingbie;
    }
}
