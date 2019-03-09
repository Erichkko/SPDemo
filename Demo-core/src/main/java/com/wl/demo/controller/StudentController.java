package com.wl.demo.controller;


import com.wl.demo.model.Student;
import com.wl.demo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("add")
    public String add(Student student) {
        return null;
    }
    @PostMapping("update")
    public String update(Student student) {
        return null;
    }
    @PostMapping("delete")
    public String deleteBysno(Integer sno) {
        return null;
    }
    @GetMapping("query/{sno}")
    public String queryStudentBySno(@PathVariable Integer sno) {
        log.info("sno == "+sno);
        Student student = studentService.queryStudentBySno(sno);
        log.info("student == "+student);
        return null;
    }
}
