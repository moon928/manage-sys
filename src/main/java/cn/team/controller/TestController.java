package cn.team.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.team.bean.Cla;
import cn.team.bean.Dept;
import cn.team.bean.Professional;
import cn.team.service.ClaService;
import cn.team.service.DeptService;
import cn.team.service.ProService;

@RestController
public class TestController {
	@Autowired 
	DeptService deptService;
	
	@RequestMapping(value="/getAllDepts")
	public Map<String,Object> getAllDepts(){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("depts", deptService.getAllDept());
		return map;
	}
	
	@RequestMapping(value="/getDeptByName/{name}")
	public Map<String,Object> getDeptByName(@PathVariable String name){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("deptsByName", deptService.getDeptByName(name));
		return map;
	}
	
	@RequestMapping(value="/getDeptById/{id}")
	public Map<String,Object> getDeptById(@PathVariable int id){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("deptsById", deptService.getDeptById(id));
		return map;
	}
	
	@RequestMapping(value="/addDept")
	public String addDept(){
		Dept dept = new Dept();
		dept.setName("123");
		dept.setManageId(2);
		int i = deptService.addDept(dept);
		return i==1?"addDept true":"addDept false";
	}
	
	@RequestMapping(value="/updateDept")
	public String updateDept(){
		Dept dept = new Dept();
		dept.setId(5);
		dept.setName("123456");
		dept.setManageId(2);
		int i = deptService.updateDept(dept);
		return i==1?"updateDept true":"updateDept false";
	}
	
	@RequestMapping(value="/deleteDeptById/{id}")
	public String deleteDept(@PathVariable int id){
		
		int i = deptService.deleteDeptById(id);
		return i==1?"deleteDept true":"deleteDept false";
	}
	
	//----------------------------Pro--------------------------------
	
	@Autowired 
	ProService proService;
	
	@RequestMapping(value="/getAllPros")
	public Map<String,Object> getAllPros(){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("pros", proService.getAllPro());
		return map;
	}
	
	@RequestMapping(value="/getProByName/{name}")
	public Map<String,Object> getProByName(@PathVariable String name){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("prosByName", proService.getProByName(name));
		return map;
	}
	
	@RequestMapping(value="/getProById/{id}")
	public String getProById(@PathVariable int id){
		//Map<String,Object> map = new HashMap<String, Object>();
		//map.put("ProById",proService.getProById(id));
		Professional professional = new Professional();
		professional = proService.getProById(id);
		return professional.toString();
	}
	
	@RequestMapping(value="/addPro")
	public String addPro(){
		Professional professional = new Professional();
		professional.setName("123");
		professional.setManageId(2);
		int i = proService.addPro(professional);
		return i==1?"addPro true":"addPro false";
	}
	
	@RequestMapping(value="/updatePro")
	public String updatePro(){
		Professional professional = new Professional();
		professional.setId(5);
		professional.setName("123456");
		professional.setManageId(2);
		professional.setParentId(2);
		int i = proService.updatePro(professional);
		return i==1?"updatePro true":"updatePro false";
	}
	
	@RequestMapping(value="/deleteProById/{id}")
	public String deletePro(@PathVariable int id){
		
		int i = proService.deleteProById(id);
		return i==1?"deletePro true":"deletePro false";
	}
	
	//----------------------------Cla--------------------------------
	
		@Autowired 
		ClaService claService;
		
		@RequestMapping(value="/getAllClas")
		public Map<String,Object> getAllClas(){
			Map<String,Object> map = new HashMap<String, Object>();
			map.put("clas", claService.getAllCla());
			return map;
		}
		
		@RequestMapping(value="/getClaByName/{name}")
		public Map<String,Object> getClaByName(@PathVariable String name){
			Map<String,Object> map = new HashMap<String, Object>();
			map.put("clasByName", claService.getClaByName(name));
			return map;
		}
		
		@RequestMapping(value="/getClaById/{id}")
		public String getClaById(@PathVariable int id){
			//Map<String,Object> map = new HashMap<String, Object>();
			//map.put("ProById",proService.getProById(id));
			Cla cla = new Cla();
			cla = claService.getClaById(id);
			return cla.toString();
		}
		
		@RequestMapping(value="/addCla")
		public String addCla(){
			Cla cla = new Cla();
			cla.setName("123");
			cla.setManageId(2);
			cla.setParentId(2);
			int i = claService.addCla(cla);
			return i==1?"addCla true":"addCla false";
		}
		
		@RequestMapping(value="/updateCla")
		public String updateCla(){
			Cla cla = new Cla();
			cla.setId(8);
			cla.setName("123456");
			cla.setManageId(2);
			cla.setParentId(2);
			int i = claService.updateCla(cla);
			return i==1?"updateCla true":"updateCla false";
		}
		
		@RequestMapping(value="/deleteClaById/{id}")
		public String deleteCla(@PathVariable int id){
			
			int i = claService.deleteClaById(id);
			return i==1?"deleteCla true":"deleteCla false";
		}
		
	
}
