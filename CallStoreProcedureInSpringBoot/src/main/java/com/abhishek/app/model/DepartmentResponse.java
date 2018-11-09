package com.abhishek.app.model;

import java.util.ArrayList;
import java.util.List;

public class DepartmentResponse {

	private List<Department> departmentList;
	private String status;
	private String message;
	public List<Department> getDepartmentList() {
		return departmentList;
	}
	public void setDepartmentList(List<Department> departmentList) {
		this.departmentList = departmentList;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
	
	
	
}
