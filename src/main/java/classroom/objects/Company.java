package classroom.objects;

public class Company {
    String name;
    int anno;
    String profile;
    int amountEmployee;
    boolean isFinanciallyStable;

    public Company(String name, int anno, String profile, int amountEmployee, boolean isFinanciallyStable) {
        this.name = name;
        this.anno = anno;
        this.profile = profile;
        this.amountEmployee = amountEmployee;
        this.isFinanciallyStable = isFinanciallyStable;
    }

    public Company() {
    }
}
