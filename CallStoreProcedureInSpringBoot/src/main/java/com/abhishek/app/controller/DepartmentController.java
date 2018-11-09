package com.abhishek.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.abhishek.app.model.Department;
import com.abhishek.app.model.DepartmentResponse;
import com.abhishek.app.dao.DepartmentDao;

@RestController
public class DepartmentController {

	@Autowired
	 private DepartmentDao departmentDao;
	
	@GetMapping("/findAllDepartment")
	public DepartmentResponse findAllDepartments(){
		return departmentDao.getAllDepartments();
		
	}
	
	
	@PostMapping("/findDepartmentById/{deptId}")
	public DepartmentResponse findDepartmentById(@PathVariable("deptId") int deptId){
		

		return departmentDao.getDepartmentById(deptId);
		
	}
	
	
}
