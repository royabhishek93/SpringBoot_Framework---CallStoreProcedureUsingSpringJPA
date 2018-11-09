package com.abhishek.app.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.abhishek.app.model.Department;
import com.abhishek.app.model.DepartmentResponse;

@Repository
public class DepartmentDao {
	@Autowired
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public DepartmentResponse getAllDepartments(){
		DepartmentResponse departmentResponse= new DepartmentResponse();
		List<Department> departemntList= new ArrayList<Department>();
		// List<Department> deptLIst=entityManager.createNamedStoredProcedureQuery("allDepartmentsName").getResultList();
		// System.out.println("deptLIst**"+deptLIst);
		 
		
		 for (Object[] row : (List<Object[]>)entityManager.createNamedStoredProcedureQuery("allDepartmentsName").getResultList())
		 { 
			 Department department= new Department();
			 //System.out.println("***"+row[0]+"****"+row[1]+"***"+row[2]+"***"+row[3]);
			 if(row[0]!=null) {
			 department.setDepartmentId((int)row[0]);
			 }
			 else {
				 department.setDepartmentId(0);
			 }
			 
			 if(row[1]!=null) {
			 department.setDepartmentName((String)row[1]);
			 }
			 else {
				 department.setDepartmentName("");
			 }
			 if(row[2]!=null) {
			 department.setManagerId((int)row[2]);
			 }
			 else {
				 department.setManagerId(0);
			 }
			 if(row[3]!=null) {
			 department.setLocationId((int)row[3]);
			 }
			 else {
				 department.setLocationId(0);
			 }
			 departemntList.add(department);
			 departmentResponse.setDepartmentList(departemntList);
			}
		
		 
		
		 departmentResponse.setStatus("Success");
		 departmentResponse.setMessage("Done!");
		 
		 return departmentResponse;
	}
	
	@SuppressWarnings("unchecked")
	public DepartmentResponse getDepartmentById(int tdeptId){
		
		DepartmentResponse departmentResponse= new DepartmentResponse();
		List<Department> departemntList= new ArrayList<Department>();
		
		// List<Department> deptList= entityManager.createNamedStoredProcedureQuery("departmentById").setParameter("deptId", tdeptId).getResultList();
		
		
		 for (Object[] row : (List<Object[]>)entityManager.createNamedStoredProcedureQuery("departmentById").setParameter("deptId", tdeptId).getResultList()) { 
			
			 Department department= new Department();
			 //System.out.println("***"+row[0]+"****"+row[1]+"***"+row[2]+"***"+row[3]);
			 if(row[0]!=null) {
			 department.setDepartmentId((int)row[0]);
			 }
			 else {
				 department.setDepartmentId(0);
			 }
			 
			 if(row[1]!=null) {
			 department.setDepartmentName((String)row[1]);
			 }
			 else {
				 department.setDepartmentName("");
			 }
			 if(row[2]!=null) {
			 department.setManagerId((int)row[2]);
			 }
			 else {
				 department.setManagerId(0);
			 }
			 if(row[3]!=null) {
			 department.setLocationId((int)row[3]);
			 }
			 else {
				 department.setLocationId(0);
			 }
			 departemntList.add(department);

			}
		
		 
		 departmentResponse.setDepartmentList(departemntList);
		 departmentResponse.setStatus("Success");
		 departmentResponse.setMessage("Done!");

		
		 return departmentResponse;
	}

}
