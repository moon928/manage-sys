package cn.team.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.team.bean.Professional;

@Mapper
public interface ProMapper {
	
	List<Professional> findAllPros();
	
	List<Professional> findProsByName(@Param("name") String name);
	
	Professional findProById(@Param("id") int id);
	
	int addPro(Professional professional);
	
	int updatePro(@Param("pro") Professional professional);
	
	int deleteProById(@Param("id") int id);
}
