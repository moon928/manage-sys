package cn.team.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.team.bean.Cla;

@Mapper
public interface ClaMapper {
	List<Cla> findAllClas();
	
	List<Cla> findClasByName(@Param("name") String name);
	
	Cla findClaById(@Param("id") int id);
	
	int addCla(Cla cla);
	
	int updateCla(@Param("cla") Cla cla);
	
	int deleteClaById(@Param("id") int id);
}
