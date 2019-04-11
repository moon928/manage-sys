package cn.team.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.team.bean.Teacher;

@Mapper
public interface TeacherMapper {
	List<Teacher> findAllTeacher();
	
	List<Teacher> findTeacherByTeachername(@Param("name") String name);
	
	Teacher findTeacherById(@Param("id") int id);
	
	int addTeacher(Teacher teacher);
	
	int updateTeacher(@Param("tea") Teacher teacher);
	
	int deleteTeacherById(@Param("id") int id);
	
}
