package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import kr.ac.hansung.model.RegistedCourse;


public class CourseMapper implements RowMapper<RegistedCourse>{

	@Override
	public RegistedCourse mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		RegistedCourse rCourse = new RegistedCourse();
		
		rCourse.setCourse_id(rs.getString("course_id"));
		rCourse.setYear(rs.getInt("year"));
		rCourse.setTerm(rs.getInt("term"));
		rCourse.setDivision(rs.getString("division"));
		rCourse.setCoursename(rs.getString("coursename"));
		rCourse.setCredit(rs.getInt("credit"));
		
		return rCourse;
	}

}
