package by.belhard.hibernate.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity

@NamedQueries(value = {
        @NamedQuery(name = "getAllEmployees", query = "from Employee"),
        @NamedQuery(name = "getEmployeeById", query = "from Employee where id = :id"),
        @NamedQuery(name = "updateEmployeInformation", query = "update Employee set name = :name," +
                "designation    = :designation, department = :dept " +
                "where id = :id")
})
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "EMP_ID")
    private Integer id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DESIGNATION")
    private String designation;
    @ManyToOne
    @JoinColumn(name = "DPT_ID")
    private Department department;

    public Employee(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != null ? !id.equals(employee.id) : employee.id != null) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        if (designation != null ? !designation.equals(employee.designation) : employee.designation != null)
            return false;
        return department != null ? department.equals(employee.department) : employee.department == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (designation != null ? designation.hashCode() : 0);
        result = 31 * result + (department != null ? department.hashCode() : 0);
        return result;
    }
}
