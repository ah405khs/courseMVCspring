package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import kr.ac.hansung.model.ApplyCourse;

public class ApplyMapper implements RowMapper<ApplyCourse>{

	@Override
	public ApplyCourse mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		ApplyCourse aCourse = new ApplyCourse();
		
		aCourse.setCourse_id(rs.getString("course_id"));
		aCourse.setYear(rs.getInt("year"));
		aCourse.setTerm(rs.getInt("term"));
		aCourse.setDivision(rs.getString("division"));
		aCourse.setCoursename(rs.getString("coursename"));
		aCourse.setCredit(rs.getInt("credit"));
		
		return aCourse;
	}

}
