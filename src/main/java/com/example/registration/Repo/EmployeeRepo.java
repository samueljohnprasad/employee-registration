package com.example.registration.Repo;


import com.example.registration.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface EmployeeRepo  extends JpaRepository<Employee, Integer> {

    Optional<Employee>  findOneByEmailAndPassword(String email, String password);
    Employee findByEmail(String email);

}
