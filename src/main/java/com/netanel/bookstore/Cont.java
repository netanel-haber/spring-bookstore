package com.netanel.bookstore;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// import net.guides.springboot2.springboot2jpacrudexample.exception.ResourceNotFoundException;
// import net.guides.springboot2.springboot2jpacrudexample.model.Employee;
// import net.guides.springboot2.springboot2jpacrudexample.repository.EmployeeRepository;

@Controller
public class Cont {
    @Autowired
    private BookRepo bookRepo;

    @GetMapping(path = "/")
    public String books(Model model) {
        model.addAttribute("books", bookRepo.findAll());
        return "books.html";
    }

    
    // @GetMapping(path = "/api/all")
    // @ResponseBody
    // public Iterable<Book> getAllUsers() {
    //     // This returns a JSON or XML with the users
    //     return ;
    // }

    // @GetMapping("/students")
    // public List<Student> getAllStudents() {
    // return studentRepo.findAll();
    // }

    // @GetMapping("/students/{id}")
    // public ResponseEntity<Optional<Student>> getStudentById(@PathVariable(value =
    // "id") Long id) {
    // Optional<Student> student = studentRepo.findById(id);
    // return ResponseEntity.ok().body(student);
    // }

    // @PostMapping("/students")
    // public Student createStudent(@Valid @RequestBody Student student) {
    // return studentRepo.save(student);
    // }

    // @PutMapping("/students/{id}")
    // public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id")
    // Long employeeId,
    // @Valid @RequestBody Employee employeeDetails) throws
    // ResourceNotFoundException {
    // Employee employee = employeeRepository.findById(employeeId)
    // .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this
    // id :: " + employeeId));

    // employee.setEmailId(employeeDetails.getEmailId());
    // employee.setLastName(employeeDetails.getLastName());
    // employee.setFirstName(employeeDetails.getFirstName());
    // final Employee updatedEmployee = employeeRepository.save(employee);
    // return ResponseEntity.ok(updatedEmployee);
    // }

    // @DeleteMapping("/employees/{id}")
    // public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long
    // employeeId)
    // throws ResourceNotFoundException {
    // Employee employee = employeeRepository.findById(employeeId)
    // .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this
    // id :: " + employeeId));

    // employeeRepository.delete(employee);
    // Map<String, Boolean> response = new HashMap<>();
    // response.put("deleted", Boolean.TRUE);
    // return response;
    // }
}