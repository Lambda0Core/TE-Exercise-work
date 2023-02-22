package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.techelevator.projects.model.Project;
import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcEmployeeDao implements EmployeeDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		String sqlGetEmployee = "SELECT * FROM employee";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetEmployee);
		while (results.next()) {
			Employee employeee = mapRowToEmployee(results);
			employees.add(employeee);
		}
		return employees;
	}

	private Employee mapRowToEmployee(SqlRowSet results) {
		Employee employee = new Employee();
		employee.setId(results.getInt("employee_id"));
		employee.setDepartmentId(results.getInt("department_id"));
		employee.setFirstName(results.getString("first_name"));
		employee.setLastName(results.getString("last_name"));
		employee.setBirthDate(results.getDate("birth_date").toLocalDate());
		employee.setHireDate(results.getDate("hire_date").toLocalDate());
		return employee;
	}


	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		String sqlFindEmployeeByName = "";
		lastNameSearch = "%" + lastNameSearch + "%";
		firstNameSearch = "%" + firstNameSearch + "%";
		SqlRowSet results;

		sqlFindEmployeeByName = "SELECT * FROM employee Where first_name ILIKE ? AND last_name ILIKE ?";
		results = jdbcTemplate.queryForRowSet(sqlFindEmployeeByName, firstNameSearch, lastNameSearch);
		while (results.next()) {
			Employee employee = mapRowToEmployee(results);
			employees.add(employee);
		}
		return employees;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(int projectId) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		String sql = "SELECT employee.* " +
				"FROM employee " +
				"INNER JOIN project_employee " +
				"ON project_employee.employee_id = employee.employee_id " +
				"WHERE project_id = ? ";

		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, projectId);
		while (results.next()) {
			Employee theEmp = mapRowToEmployee(results);
			employees.add(theEmp);
		}
		return employees;
	}

	@Override
	public void addEmployeeToProject(int projectId, int employeeId) {
		String sql = "INSERT INTO project_employee( " +
				" employee_id, project_id) " +
				" VALUES (?, ?);";
		jdbcTemplate.update(sql, employeeId, projectId);
	}

	@Override
	public void removeEmployeeFromProject(int projectId, int employeeId) {
		String sql = "DELETE from project_employee where employee_id = ? and project_id = ?";
		jdbcTemplate.update(sql, employeeId, projectId);

	}
	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		String sqlGetEmployeesWOPRoj = "SELECT DISTINCT employee.* FROM employee LEFT OUTER JOIN project_employee ON employee.employee_id = project_employee.employee_id LEFT OUTER JOIN project "
				+ " ON project_employee.project_id = project.project_id "
				+ " WHERE project.project_id IS NULL ";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetEmployeesWOPRoj);
		while (results.next()) {
			Employee employee = mapRowToEmployee(results);
			employees.add(employee);
		}
		return employees;

	}


}
