package pl.javastart.springdatacustomqueries.model;

import javax.persistence.*;

@Entity
@NamedQuery(name = "Employee.findByLastNameAndSalary"
, query = "SELECT e FROM Employee e WHERE e.lastName=:lastname AND e.salary=:salary")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private double salary;

    public Employee() {
    }

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id
                + ", firstName=" + firstName
                + ", lastName=" + lastName
                + ", salary=" + salary
                + "]";
    }
}
