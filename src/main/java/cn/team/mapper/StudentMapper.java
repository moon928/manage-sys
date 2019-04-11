package cn.team.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.team.bean.Cla;
import cn.team.bean.Dept;
import cn.team.bean.Professional;
import cn.team.bean.Student;

@Mapper
public interface StudentMapper {
	List<Student> findAllStudent();
	List<Cla> findAllCla();
	List<Professional> findAllProfessional();
	List<Dept> findAllDept();
	int addStudent(Student student);
	int updateStudent(@Param("stu") Student student);
	List<Cla> findAllClass();
	Student findStudentById(@Param("id") int id);
	List<Student> findStudentByName(@Param("name") String name);
	int deleteStudentById(@Param("id") int id);
}
