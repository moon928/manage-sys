package cn.team.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.team.bean.Student;
import cn.team.service.StudentService;

@RestController
@EnableAutoConfiguration

public class StudentController {
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value="/getAllStudent") 
	@ResponseBody
    public Map<String, Object> getAllStudent(){
		Map<String, Object> map = new HashMap<>();
	    map.put("students", studentService.getAllStudent());
		return map;
    }
	@RequestMapping(value="/addStudent") 
	@ResponseBody
    public String addStudent(){
		Student student = new Student();
		student.setUsername("111");
		student.setPassword("111");
		student.setClassId(1);
		student.setDegreeId(1);
		int i = studentService.addStudent(student);
		return i==1?"add true":"false";
    }
	@RequestMapping(value="/deleteStudentById/{id}") 
    public String deleteStudentById(@PathVariable int id){
        int i = studentService.deleteStudentById(id);
		return i==1?"delete true":"false";
    }
	@RequestMapping(value="/updateStudent") //修改时不能修改班级id和学位id；
    public String updateStudent(){
		Student student = new Student();
		student.setId(8);
		student.setName("stu7");
		student.setPassword("123456");
		student.setClassId(1);
		student.setDegreeId(1);
		
        int i = studentService.updateStudent(student);
		return i==1?"update true":"false";
    }
	@RequestMapping(value="/findStudentByName/{name}") 
    public Map<String,Object> getStudentByName(@PathVariable String name){
		Map<String, Object> map = new HashMap<>();
	    map.put("students", studentService.getStudentByName(name));
		return map;
		
    }
}
