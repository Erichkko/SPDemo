package com.wl.demo.service;

import com.wl.demo.model.Student;

public interface StudentService {
    int add(Student student);
    int update(Student student);
    int deleteBysno(String sno);
    Student queryStudentBySno(Integer sno);
}
