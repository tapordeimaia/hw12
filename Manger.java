public class Manger extends Employee implements conductInterview, attendTraining{

    public Manger(String departament, int age, String name) {

        super(departament, age, name);
    }

    @Override
    public void attendTraining() {
        System.out.println(getName()+ " attended communications training.");
    }

    @Override
    public void conductInterview() {
        System.out.println(getName()+ " conducted interview");
    }
}
