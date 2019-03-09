package com.wl.demo.service.serviceimp;

import com.wl.demo.dao.StudentMapper;
import com.wl.demo.model.Student;
import com.wl.demo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int add(Student student) {
        return this.studentMapper.add(student);
    }

    @Override
    public int update(Student student) {
        return this.studentMapper.update(student);
    }

    @Override
    public int deleteBysno(Integer sno) {
        return this.studentMapper.deleteBysno(sno);
    }

    @Override
    public Student queryStudentBySno(Integer sno) {
        log.error("sno == "+sno);
        Student student = studentMapper.queryStudentBySno(sno);
        log.error("student == "+student);
        return student;
    }
}