package cn.team.service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.team.bean.Cla;
import cn.team.bean.Dept;
import cn.team.bean.Professional;
import cn.team.bean.Student;
import cn.team.mapper.StudentMapper;

@Service
@Transactional
public class StudentService {
	@Autowired
	StudentMapper studentMapper;
//	SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
//    SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
//    SimpleDateFormat birthdayFormat = new SimpleDateFormat("yyyy-MM-dd");
//    DecimalFormat decimalFormat = new DecimalFormat("##.00");
//	
	
	public List<Student> getAllStudent(){
		return studentMapper.findAllStudent();
	}
	
	public int addStudent(Student student) {
		return studentMapper.addStudent(student);
	}
	
	public List<Cla> getAllCla(){
		return studentMapper.findAllCla();
	}
	public List<Professional> getAllProfessional(){
		return studentMapper.findAllProfessional();
	}
	public List<Dept> getAllDept(){
		return studentMapper.findAllDept();
	}
	
	public int updateStudent(Student student) {
		return studentMapper.updateStudent(student);
	}
	public List<Student> getStudentByName(String name){
		return studentMapper.findStudentByName(name);
	}
	public Student getStudentById(int id) {
		return studentMapper.findStudentById(id);
	}
	public int deleteStudentById(int id) {
		return studentMapper.deleteStudentById(id);
	}
	
}
