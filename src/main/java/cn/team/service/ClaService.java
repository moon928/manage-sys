package cn.team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.team.bean.Cla;
import cn.team.bean.Professional;
import cn.team.mapper.ClaMapper;

@Service
@Transactional
public class ClaService {
	@Autowired
	ClaMapper claMapper;
	
	public List<Cla> getAllCla(){
		return claMapper.findAllClas(); 
	}
	
	public List<Cla> getClaByName(String name){
		return claMapper.findClasByName(name);
	}
	
	public Cla getClaById(int id) {
		return claMapper.findClaById(id);
	}
	
	public int updateCla(Cla cla) {
		return claMapper.updateCla(cla);
	}
	
	public int addCla(Cla cla) {
		return claMapper.addCla(cla);
	}
	
	public int deleteClaById(int id) {
		return claMapper.deleteClaById(id);
	}
}
