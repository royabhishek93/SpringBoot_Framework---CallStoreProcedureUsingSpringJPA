package com.abhishek.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table

@NamedStoredProcedureQueries({@NamedStoredProcedureQuery(name="allDepartmentsName",procedureName="getDepartments"),
							  @NamedStoredProcedureQuery(name="departmentById",procedureName="getDepartmentById",parameters= {@StoredProcedureParameter(mode=ParameterMode.IN,name="deptId",type=Integer.class)})})
public class Department {

	@Id
	private int departmentId;
	private String departmentName;
	private int locationId;
	private int managerId;
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	
}
