package classroom.objects;

public class Tree {
    String name;
    int age;
    String leavesColor;
    boolean isChopped;
    String origin;

    public Tree() {
    }

    public Tree(String name, int age, String leavesColor, boolean isChopped, String origin) {
        this.name = name;
        this.age = age;
        this.leavesColor = leavesColor;
        this.isChopped = isChopped;
        this.origin = origin;
    }
}
