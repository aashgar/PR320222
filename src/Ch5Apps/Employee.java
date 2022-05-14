/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch5Apps;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author aashgar
 */
@Entity
@Table(name = "Employee")
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", 
            query = "Select e From Employee e"),
    @NamedQuery(name = "Employee.findById",
            query = "Select e From Employee e Where e.id= :id")
})
public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double salary;
    @ManyToOne
    private Department dept;
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "Employee_Projects",
            joinColumns = @JoinColumn(name = "Employee_Id"),
            inverseJoinColumns = @JoinColumn(name = "Project_Id")
    )
    private List<Project> projects;

    public Employee() {
    }

    public Employee(String name, Double salary, Department dept) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getDept_id() {
        return dept.getId();
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }
    
}
