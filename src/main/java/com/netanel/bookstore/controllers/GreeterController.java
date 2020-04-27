package com.netanel.bookstore.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import com.netanel.bookstore.BookRepo;

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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Controller
public class GreeterController {
    // @Autowired
    // private BookRepo bookRepo;

    // @GetMapping(path = "/")
    // public String books() {
    // return "index.html";
    // }



    // @GetMapping(path = "/api/all")
    // @ResponseBody
    // public Iterable<Book> getAllUsers() {
    // // This returns a JSON or XML with the users
    // return ;
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