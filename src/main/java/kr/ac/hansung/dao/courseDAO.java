package kr.ac.hansung.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.RegistedCourse;


@Repository
public class courseDAO {
	private JdbcTemplate jdbcTemplateObject;
	private DataSource dataSource;
	
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public List<RegistedCourse> getCourse(){
		String sql = "select * from registedcourse";
		return jdbcTemplateObject.query(sql, new CourseMapper());
	}
	
	public List<RegistedCourse> get_term_course(){
		String sql = "select year, term, sum(credit) from registedcourse group by year,term";
		return jdbcTemplateObject.query(sql, new TermCourseMapper());
	}
	
	public List<RegistedCourse> get_division_course(){
		String sql = "select division,sum(credit) from registedcourse group by division";
		return jdbcTemplateObject.query(sql, new DivisionCourseMapper());
	}
	
	
}
