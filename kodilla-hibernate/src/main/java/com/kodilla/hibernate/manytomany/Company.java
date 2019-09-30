package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
        name = "Company.findCompanyByFirstThreeCharacters",
        query = "SELECT * FROM COMPANIES WHERE SUBSTRING(COMPANY_NAME,1,3) LIKE :FIRST_THREE_CHARS",
        resultClass = Company.class
)
@Entity
@Table(name = "COMPANIES")
public class Company {

    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company() {

    }

    public Company(String name) {
        this.name = name;
    }
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
      public List<Employee> getEmployees() {
        return employees;
    }

    private void setEmployees(List<Employee> employee) {
        this.employees = employee;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }
}
