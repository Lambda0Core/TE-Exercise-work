package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;

public class JdbcDepartmentDao implements DepartmentDao {
	
	private final JdbcTemplate jdbcTemplate;

	public JdbcDepartmentDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Department getDepartment(int departmentId) {
		Department department = null;

		String sql = "SELECT department.department_id, department.name " +
				" from department " +
				"WHERE department.department_id =  ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, departmentId);

		if (results.next()){
			department = mapRowToDepartment(results);
		}

		return department;
	}

	@Override
	public List<Department> getAllDepartments() {
		ArrayList<Department> departments = new ArrayList<Department>();
		String sqlGetDepartment = "SELECT * FROM department";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetDepartment);
		while (results.next()) {
			Department theDepartment = mapRowToDepartment(results);
			departments.add(theDepartment);
		}
		return departments;
	}

	private Department mapRowToDepartment(SqlRowSet results) {
		Department department = new Department();
		department.setId(results.getInt("department_id"));
		department.setName(results.getString("name"));
		return department;
	}


	@Override
	public void updateDepartment(Department updatedDepartment) {
		String sql = "UPDATE department " +
				"SET name = ? " +
				"WHERE department_id = ?;";
		jdbcTemplate.update(sql, updatedDepartment.getName(), updatedDepartment.getId());
	}
}
