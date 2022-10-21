package StuPickCouse_Dos.PickCouse;

public class Couse {
    String id;
    String name;
    String num;//选课人数
    String capacity;//容量
    String teacher;
   public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Couse(String id, String name, String num, String capacity, String teacher) {
        this.id = id;
        this.name = name;
        this.num = num;
        this.capacity = capacity;
        this.teacher = teacher;
    }

    public Couse(String id){this.id=id;}

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

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
    	    return id +"	"+ name +"	"+ num+ "/" + capacity+"	" +teacher;
    }
}

