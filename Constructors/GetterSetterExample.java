package RemoteRepoNexux.Constructors;

public class GetterSetterExample {
    final private int id = 1209;
    String name;
    private double salary;

    public GetterSetterExample (String name) {
        this.name = name;
    }

    public int getId () {
        return id;
    }

    public void setSalary (double salary) {
        this.salary = salary;
    }

    public double getSalary () {
        return salary;
    }

}
