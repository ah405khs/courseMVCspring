package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import kr.ac.hansung.model.RegistedCourse;

public class DivisionCourseMapper implements RowMapper<RegistedCourse> {

	@Override
	public RegistedCourse mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		RegistedCourse rCourse = new RegistedCourse();

		rCourse.setDivision(rs.getString("division"));
		rCourse.setSum(rs.getInt("sum(credit)"));

		return rCourse;

	}

}
