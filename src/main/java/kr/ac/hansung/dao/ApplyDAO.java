package kr.ac.hansung.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.ApplyCourse;

@Repository
public class ApplyDAO {
	private JdbcTemplate jdbcTemplateObject;
	private DataSource dataSource;
	
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public List<ApplyCourse> getCourse(){
		String sql = "select * from newapply";
		return jdbcTemplateObject.query(sql, new ApplyMapper());
	}
	
	public boolean insert(ApplyCourse apply){
		String course_id = apply.getCourse_id();
		int year = apply.getYear();
		int term = apply.getTerm();
		String division = apply.getDivision();
		String coursename = apply.getCoursename();
		int credit = apply.getCredit();
		
		String sql = "insert into newapply (course_id, year, term, division, coursename, credit)";
			sql += " values (?,?,?,?,?,?)";
			
		return (jdbcTemplateObject.update(sql,new Object[]{course_id, year, term, division, coursename, credit})==1);
	}
	
	
}
