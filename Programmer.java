public class Programmer extends Employee implements attendTraining{
    public Programmer(String departament, int age, String name) {
        super(departament, age, name);
    }

    @Override
    public void attendTraining() {

        System.out.println(getName() + " attended IT training");
    }
}
