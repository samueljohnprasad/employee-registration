package com.example.registration.Service;
import com.example.registration.DTO.EmployeeDTO;
import com.example.registration.DTO.LoginDTO;
import com.example.registration.payloadResponse.LoginResponse;

public interface EmployeeService {
     String addEmployee(EmployeeDTO employeeDTO);

     LoginResponse loginEmployee(LoginDTO loginDTO);
}
