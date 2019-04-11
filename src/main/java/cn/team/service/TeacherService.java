package cn.team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.team.bean.Teacher;
import cn.team.mapper.TeacherMapper;

@Service
@Transactional
public class TeacherService {
	@Autowired
	TeacherMapper teacherMapper;
	public List<Teacher> getAllTeacher(){
		return teacherMapper.findAllTeacher();
	}
	
	public List<Teacher> getTeacherByName(String name){
		return teacherMapper.findTeacherByTeachername(name);
	}
	
	public Teacher getTeacherById(int id) {
		return teacherMapper.findTeacherById(id);
	}
	
	public int updateTeacher(Teacher teacher) {
		return teacherMapper.updateTeacher(teacher);
	}
	
	public int addTeacher(Teacher teacher) {
		return teacherMapper.addTeacher(teacher);
	}
	
	public int deleteTeacherById(int id) {
		return teacherMapper.deleteTeacherById(id);
	}
}
