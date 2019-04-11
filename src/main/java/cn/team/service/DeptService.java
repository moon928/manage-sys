package cn.team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.team.bean.Dept;
import cn.team.mapper.DeptMapper;

@Service
@Transactional
public class DeptService {
	@Autowired
	DeptMapper deptMapper;
	
	public List<Dept> getAllDept(){
		return deptMapper.findAllDepts(); 
	}
	
	public List<Dept> getDeptByName(String name){
		return deptMapper.findDeptByName(name);
	}
	
	public Dept getDeptById(int id) {
		return deptMapper.findDeptById(id);
	}
	
	public int updateDept(Dept dept) {
		return deptMapper.updateDept(dept);
	}
	
	public int addDept(Dept dept) {
		return deptMapper.addDept(dept);
	}
	
	public int deleteDeptById(int id) {
		return deptMapper.deleteDeptById(id);
	}
}
