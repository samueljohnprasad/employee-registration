package com.example.registration.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class EmployeeDTO {



    private  int employeeId;
    private String employeeName;

    private String password;
    private String email;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployee_name(String employee_name) {
        this.employeeName = employee_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public EmployeeDTO(int employeeId, String employee_name, String password, String email) {
        this.employeeId = employeeId;
        this.employeeName = employee_name;
        this.password = password;
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
