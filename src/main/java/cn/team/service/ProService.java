package cn.team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.team.bean.Dept;
import cn.team.bean.Professional;
import cn.team.mapper.ProMapper;

@Service
@Transactional
public class ProService {
	@Autowired
	ProMapper proMapper;
	
	public List<Professional> getAllPro(){
		return proMapper.findAllPros(); 
	}
	
	public List<Professional> getProByName(String name){
		return proMapper.findProsByName(name);
	}
	
	public Professional getProById(int id) {
		return proMapper.findProById(id);
	}
	
	public int updatePro(Professional professional) {
		return proMapper.updatePro(professional);
	}
	
	public int addPro(Professional professional) {
		return proMapper.addPro(professional);
	}
	
	public int deleteProById(int id) {
		return proMapper.deleteProById(id);
	}
}
