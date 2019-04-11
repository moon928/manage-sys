package cn.team.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.team.bean.Teacher;
import cn.team.service.TeacherService;

@RestController
@EnableAutoConfiguration
public class TeacherController {
	@Autowired
	TeacherService teacherService;
	
	@RequestMapping(value="/getAllTeachers")
	public Map<String,Object> getAllTeachers() {
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("teachers", teacherService.getAllTeacher());
		return map;
	}
	
	@RequestMapping(value="/getTeacherByName/{name}")
	public Map<String,Object> getTeacherByName(@PathVariable String name) {
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("teachers", teacherService.getTeacherByName(name));
		return map;
	}
	
	@RequestMapping(value="/getTeacherById/{id}")
	public String getTeacherById(@PathVariable int id) {
		Teacher teacher = new Teacher();
		teacher = teacherService.getTeacherById(id);
		return teacher.toString();
	}
	
	@RequestMapping(value="/updateTeacher")
	public String updateTeacher() {
		Teacher teacher = new Teacher();
		teacher.setId(6);
		teacher.setName("ttt4");
		teacher.setPassword("ttttttttt4");
		teacher.setDeptId(1);
		teacher.setPositionId(1);
		int i=teacherService.updateTeacher(teacher);
		return i==1?"update true":"update false";
	}
	
	@RequestMapping(value="/addTeacher")
	public String addTeacher() {
		Teacher teacher = new Teacher();
		//teacher.setName("ttt5");
		teacher.setUsername("ttt5");
		teacher.setPassword("tt+++++5");
		teacher.setPositionId(1);
		teacher.setDeptId(1);
		int i=teacherService.addTeacher(teacher);
		return i==1?"add true":"add false";
	}
	
	@RequestMapping(value="/deleteTeacherById/{id}")
	public String deleteTeacher(@PathVariable int id) {
		int i=teacherService.deleteTeacherById(id);
		return i==1?"delete true":"delete false";
	}
	
	
}
