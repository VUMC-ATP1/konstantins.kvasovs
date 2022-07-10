package classroom.objects;

public class Employee {
    String name;
    int age;
    int experience;
    boolean isDistantWorker;
    char gender;

    public Employee(String name, int age, int experience, boolean isDistantWorker, char gender) {

        this.name = name;
        this.age = age;
        this.experience = experience;
        this.isDistantWorker = isDistantWorker;
        this.gender = gender;
    }

    public Employee() {
    }
}
