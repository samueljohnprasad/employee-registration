package com.example.registration.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    public Employee() {
    }

    @Id
    @Column(name = "employee_id" , length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int employeeId;

    @Column(name = "employee_name", length = 255)
    private String employeeName;

    @Column(name = "password", length = 255)
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "email", length = 255)
    private String email;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Employee(int employeeId, String employeeName, String email, String password) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.password = password;
        this.email = email;
    }

    public int getEmployeeId() {
        return employeeId;
    }



    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
