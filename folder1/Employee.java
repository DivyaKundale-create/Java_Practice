package org.example.classes;

//import lombok.Getter;

//@Getter // not able to check load or check this
public class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary)
    {
        this.name=name;
        this.department = department;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public String getDepartment()
    {
        return department;
    }



    // constructor + getters
}
