package StuPickCouse_Dos.PickCouse;

public class User {
    String id;
    String pwd;
    String name;
    String sex;
    String pross;//רҵ

    public User(String id,String pwd){
        this.id=id;
        this.pwd=pwd;
    }
    public User(String id, String name, String sex, String pross) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.pross = pross;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public User(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPross() {
        return pross;
    }

    public void setPross(String pross) {
        this.pross = pross;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", pross='" + pross + '\'' +
                '}';
    }
}

