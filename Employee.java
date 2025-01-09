public class Employee {
    private int age;
    private String name;
    private String departament;
    public Employee (String departament, int age, String name){
        this.age = age;
        this.name = name;
        this.departament = departament;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
