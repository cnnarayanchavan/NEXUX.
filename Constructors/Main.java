package RemoteRepoNexux.Constructors;

public class Main {
    public static void main(String[] args) {
        //all the instances will be here only
        GetterSetterExample example = new GetterSetterExample("Narayana");
        System.out.println("ID of an employee is: "+example.getId());

        example.setSalary(28908);
        System.out.println("Salary of an employee is: "+example.getSalary());
    }
}
