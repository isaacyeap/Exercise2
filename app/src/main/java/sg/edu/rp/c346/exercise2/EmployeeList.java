package sg.edu.rp.c346.exercise2;

public class EmployeeList {
    private String Name;
    private String Title;
    private double Salary;

    public EmployeeList(String name, String title, double salary) {
        Name = name;
        Title = title;
        Salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return Name + Title + Salary;
    }
}
