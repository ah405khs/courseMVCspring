package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.RegistedCourse;
import kr.ac.hansung.service.CourseService;



@Controller
public class CourseController {
	private CourseService courseService;
	
	@Autowired
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}

	@RequestMapping("/check")
	public String showCourse(Model model){
		List<RegistedCourse> allCourse = courseService.getCurrent();
		model.addAttribute("allcourse",allCourse);
		return "allcourse";
	}
	
	@RequestMapping("/term_check")
	public String showTermCourse(Model model){
		List<RegistedCourse> termCourse = courseService.getTurmCourse();
		model.addAttribute("termcourse",termCourse);
		return "termcourse";
	}
	
	@RequestMapping("/division_check")
	public String showDivisionCourse(Model model){
		List<RegistedCourse> divisionCourse = courseService.getDivisionCourse();
		model.addAttribute("divisioncourse",divisionCourse);
		return "divisioncourse";
	}
	
}
