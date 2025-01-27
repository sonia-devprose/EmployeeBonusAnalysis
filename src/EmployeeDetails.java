public abstract class EmployeeDetails implements Employee{

    String name;
    int salary;
    @Override
    public String getEmployeeName()
    {
        return name;
    }
    @Override
    public int getEmployeeSalary()
    {
        return salary;
    }
    @Override
    public void setEmployeeName(String name)
    {
        this.name = name;
    }
    @Override
    public void setEmployeeSalary(int salary)
    {
        this.salary = salary;
    }

    abstract double calculateBonus();

}
