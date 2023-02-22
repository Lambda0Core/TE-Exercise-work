package com.techelevator.projects.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.techelevator.projects.model.Department;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;

public class JdbcProjectDao implements ProjectDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcProjectDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Project getProject(int projectId) {
		Project project = null;

		String sql = "SELECT * FROM project WHERE project_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, projectId);

		if (results.next()){
			project = mapRowToProject(results);
		}

		return project;
	}

	@Override
	public List<Project> getAllProjects() {
		List<Project> projects = new ArrayList<Project>();
		String sqlGetProject = "SELECT * FROM project";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetProject);
		while (results.next()) {
			Project project = mapRowToProject(results);
			projects.add(project);
		}
		return projects;
	}

	private Project mapRowToProject(SqlRowSet results) {
		Project project = new Project();
		project.setId(results.getInt("project_id"));
		project.setName(results.getString("name"));

		if (results.getDate("from_date") != null) {
			project.setFromDate(results.getDate("from_date").toLocalDate());
	}
		if (results.getDate("to_date") != null) {
			project.setToDate(results.getDate("to_date").toLocalDate());
		}

		return project;
	}

	@Override
	public Project createProject(Project newProject) {
		String sql = "INSERT INTO project ( " +
				" name, from_date, to_date) " +
				" VALUES (?, ?, ?) RETURNING project_id";
		Integer newProjectId = jdbcTemplate.queryForObject(sql, Integer.class,
				newProject.getName(), newProject.getFromDate(), newProject.getToDate()
		);
		return getProject(newProjectId)  ;
	}
	@Override
	public void deleteProject(int projectId) {
		String sql = "DELETE from project_employee where project_id = ?";
		jdbcTemplate.update(sql,projectId);
		String sql2 = "DELETE from project where project_id = ?";
		jdbcTemplate.update(sql2,projectId);

	}
	

}
