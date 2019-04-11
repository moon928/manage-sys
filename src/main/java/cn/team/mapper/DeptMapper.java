package cn.team.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.team.bean.Dept;

@Mapper
public interface DeptMapper {
	List<Dept> findAllDepts();
	
	List<Dept> findDeptByName(@Param("name") String name);
	
	Dept findDeptById(@Param("id") int id);
	
	int addDept(Dept dept);
	
	int updateDept(@Param("dept") Dept dept);
	
	int deleteDeptById(@Param("id") int id);
}
