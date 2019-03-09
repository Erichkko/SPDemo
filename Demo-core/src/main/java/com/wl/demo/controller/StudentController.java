package com.wl.demo.controller;


import com.wl.demo.model.Student;
import com.wl.demo.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 *  paramType：参数放在哪个地方
 *             · header --> 请求参数的获取：@RequestHeader
 *             · query --> 请求参数的获取：@RequestParam
 *             · path（用于restful接口）--> 请求参数的获取：@PathVariable
 *             · body（不常用）
 *             · form（不常用）
 * ---------------------
 */


@Slf4j
@RestController
@RequestMapping("student")
@Api(value = "学生增删改查",description = "详细描述")
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
    @PostMapping("/delete")
    @ApiImplicitParam(name = "sno",value = "学号",paramType = "form",required = true,dataType = "Integer")
    public String deleteBysno(Integer sno) {
         studentService.deleteBysno(sno);
        return "";
    }
    //获取用户列表
    @ApiOperation(value = "获取指定学生列表",notes = "获取学生详细描述")
    @ApiImplicitParam(name = "sno",value = "学号",paramType = "path",required = true,dataType = "Integer")
    @GetMapping(value = "/query/{sno}")
    public String queryStudentBySno(@PathVariable Integer sno) {
        log.info("sno == "+sno);
        Student student = studentService.queryStudentBySno(sno);
        log.info("student == "+student);
        return null;
    }
}
