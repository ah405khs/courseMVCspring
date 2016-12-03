package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.courseDAO;
import kr.ac.hansung.model.RegistedCourse;

@Service
public class CourseService {
	private courseDAO courseDao;

	@Autowired
	public void setCourseDao(courseDAO courseDao) {
		this.courseDao = courseDao;
	}
	
	public List<RegistedCourse> getCurrent(){
		return courseDao.getCourse();
	}
	
	public List<RegistedCourse> getTurmCourse(){
		return courseDao.get_term_course();
	}
	
	public List<RegistedCourse> getDivisionCourse(){
		return courseDao.get_division_course();
	}
}
